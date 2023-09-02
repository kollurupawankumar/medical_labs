package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CBPDto {
    private String wbc;
    private String rbc;
    private String hb;
    private String plc;
    private String pcv;
    private String aec;
}
