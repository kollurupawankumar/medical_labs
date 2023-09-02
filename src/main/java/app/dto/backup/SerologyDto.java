package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SerologyDto {
    private String raTest;
    private String aso;
    private String crp;
    private String hiv;
    private String hbsAg;
    private String hcv;


}
