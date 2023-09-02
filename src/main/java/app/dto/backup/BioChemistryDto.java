package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BioChemistryDto {
    private String fbs;
    private String plbs;
    private String rbs;
    private String bloodUrea;
    private String SCreatinie;
    private String sUricAcid;
}
