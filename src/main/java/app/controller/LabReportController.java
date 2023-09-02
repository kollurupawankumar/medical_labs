package app.controller;

import app.dto.LabReportDto;
import app.service.LabReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lab-report")
public class LabReportController {

    private final LabReportService labReportService;

    @Autowired
    public LabReportController(LabReportService labReportService)
    {
        this.labReportService = labReportService;
    }

    @GetMapping("{id}")
    public LabReportDto findById(@PathVariable Long id) {
        return this.labReportService.findById(id);
    }


    @GetMapping("patient/{id}")
    public List<LabReportDto> findByLabReportName(@PathVariable String id) {
        return this.labReportService.findByPatientId(id);
    }

    @GetMapping
    public List<LabReportDto> findAll() {
        return this.labReportService.findAll();
    }

    @PostMapping
    public LabReportDto save(@RequestBody LabReportDto LabReportDto) {
        LabReportDto.setId(null);
        return this.labReportService.save(LabReportDto);
    }

    @PutMapping
    public LabReportDto update(@RequestBody LabReportDto LabReportDto) {
        return this.labReportService.save(LabReportDto);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        this.labReportService.deleteById(id);
    }

}
