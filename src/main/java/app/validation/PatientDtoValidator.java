package app.validation;

import app.common.validation.BaseValidator;
import app.common.validation.CommonValidatorUtils;
import app.dto.PatientDto;
import app.model.Patient;
import app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientDtoValidator implements BaseValidator<PatientDto> {

    private static final String FIELD_CODE = "phone";

    private final PatientRepository patientRepository;
    private final CommonValidatorUtils<PatientDto, Patient> commonValidatorUtils;

    @Autowired
    public PatientDtoValidator(
            PatientRepository patientRepository,
            CommonValidatorUtils commonValidatorUtils) {
        this.patientRepository = patientRepository;
        this.commonValidatorUtils = commonValidatorUtils;
    }

    @Override
    public void validate(PatientDto obj) {
        validateUniqueCode(obj);
    }

    private void validateUniqueCode(PatientDto patientDto) {

        Patient patient = this.patientRepository
                .findByPhone(patientDto.getPhone())
                .orElse(null);

        // Found product with the given code
        if (patient != null) {
            commonValidatorUtils.validateUniqueField(FIELD_CODE, patientDto, patient);
        }

    }
}
