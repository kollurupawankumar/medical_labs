package app.controller;

import app.dto.PatientDto;
import app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService)
    {
        this.patientService = patientService;
    }

    @GetMapping("{id}")
    public PatientDto findById(@PathVariable Long id) {
        return this.patientService.findById(id);
    }

    @GetMapping("phone/{id}")
    public PatientDto findByPhoneNumber(@PathVariable String id) {
        return this.patientService.findByPhone(id);
    }

    @GetMapping("name/{name}")
    public List<PatientDto> findByPatientName(@PathVariable String name) {
        return this.patientService.findByPatientName(name);
    }

    @GetMapping
    public List<PatientDto> findAll() {
        return this.patientService.findAll();
    }

    @PostMapping
    public PatientDto save(@RequestBody PatientDto patientDto) {
        patientDto.setId(null);
        return this.patientService.save(patientDto);
    }

    @PutMapping
    public PatientDto update(@RequestBody PatientDto patientDto) {
        return this.patientService.save(patientDto);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        this.patientService.deleteById(id);
    }

}
