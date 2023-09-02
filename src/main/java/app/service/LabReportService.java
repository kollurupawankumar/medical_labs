package app.service;

import app.dto.LabReportDto;

import java.util.List;

public interface LabReportService {

    LabReportDto findById(Long id);

    List<LabReportDto> findByPatientId(String id);

    List<LabReportDto> findAll();

    LabReportDto save(LabReportDto LadReportDto);

    void deleteById(Long id);

}
