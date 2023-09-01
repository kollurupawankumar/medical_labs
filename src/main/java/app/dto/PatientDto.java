package app.dto;

import app.model.Patient;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {

    private Long id;
    private String patientName;
    private int age;
    private String phone;
    private String gender;
    private String address;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime opDate;
    private String fatherName;
    private String identityProof;

    public PatientDto(Patient patient) {
        BeanUtils.copyProperties(patient, this);
    }
}
