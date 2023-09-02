package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MicroscopicDto {
    private String pusCells;
    private String epithCells;
    private String microRbc;
    private String casts;
    private String others;

}
