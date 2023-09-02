package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LipidProfileDto {
    private String sCholesterol;
    private String sTriglycerides;
    private String sHldCholesterol;
    private String sLldCholesterol;
}
