package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LftDto {
    private String sBilirubinT;
    private String sBilirubinD;
    private String sgOt;
    private String sgPt;
    private String sAlkalinePhosphatase;
    private String totalProteins;
    private String sAlbumin;
    private String agRatio;


}
