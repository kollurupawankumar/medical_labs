package app.service;

import app.dto.PatientDto;

import java.util.List;

public interface PatientService {

    PatientDto findById(Long id);

    PatientDto findByPhone(String id);

    List<PatientDto> findByPatientName(String name);

    List<PatientDto> findAll();

    PatientDto save(PatientDto patientDto);

    void deleteById(Long id);

}
