package app.service.impl;

import app.dto.LabReportDto;
import app.exception.ResourceNotFoundException;
import app.model.LabReport;
import app.model.Patient;
import app.repository.LabReportRepository;
import app.repository.PatientRepository;
import app.service.LabReportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LabReportServiceImpl implements LabReportService {

    private final LabReportRepository labReportRepository;
    private final PatientRepository patientRepository;

    @Autowired
    public LabReportServiceImpl(
            LabReportRepository labReportRepository, PatientRepository patientRepository){
        this.labReportRepository = labReportRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public LabReportDto findById(Long id) {
        LabReport LabReport = this.labReportRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

        return new LabReportDto(LabReport);
    }

    @Override
    public List<LabReportDto> findByPatientId(String patientId) {
        return this.labReportRepository
                .findByPatientId(patientId).get()
                .stream()
                .map(LabReportDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<LabReportDto> findAll() {
        return this.labReportRepository
                .findAll()
                .stream()
                .map(LabReportDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public LabReportDto save(LabReportDto LabReportDto) {
        LabReport LabReport = this.dtoToEntity(LabReportDto);
        LabReport savedLabReport = this.labReportRepository.save(LabReport);
        return new LabReportDto(savedLabReport);
    }

    @Override
    public void deleteById(Long id) {
        this.labReportRepository.deleteById(id);
    }


    private LabReport dtoToEntity(LabReportDto LabReportDto) {
        LabReport labReport = new LabReport();
        BeanUtils.copyProperties(LabReportDto, labReport);

        Long patientId = LabReportDto.getPatientId();
        if (patientId != null) {
            Patient patient = this.patientRepository
                    .findById(patientId)
                    .orElse(null);

            if (patient != null) {
                labReport.setPatient(patient);
            }
        }
        return labReport;
    }
}
