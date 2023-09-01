package app.service.impl;

import app.dto.PatientDto;
import app.exception.ResourceNotFoundException;
import app.model.Patient;
import app.repository.PatientRepository;
import app.service.PatientService;
import app.validation.PatientDtoValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientDtoValidator patientDtoValidator;

    @Autowired
    public PatientServiceImpl(
            PatientRepository patientRepository,
            PatientDtoValidator patientDtoValidator) {
        this.patientRepository = patientRepository;
        this.patientDtoValidator = patientDtoValidator;
    }

    @Override
    public PatientDto findById(Long id) {
        Patient patient = this.patientRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

        return new PatientDto(patient);
    }

    @Override
    public PatientDto findByPhone(String id) {
        Optional<Patient> patient = this.patientRepository.findByPhone(id);
        return new PatientDto(patient.get());
    }


    @Override
    public List<PatientDto> findByPatientName(String name) {
        return this.patientRepository
                .findByPatientName(name).get()
                .stream()
                .map(PatientDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<PatientDto> findAll() {
        return this.patientRepository
                .findAll()
                .stream()
                .map(PatientDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public PatientDto save(PatientDto patientDto) {
        patientDtoValidator.validate(patientDto);
        Patient patient = this.dtoToEntity(patientDto);
        Patient savedPatient = this.patientRepository.save(patient);
        return new PatientDto(savedPatient);
    }

    @Override
    public void deleteById(Long id) {
        this.patientRepository.deleteById(id);
    }


    private Patient dtoToEntity(PatientDto patientDto) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientDto, patient);
        return patient;
    }
}
