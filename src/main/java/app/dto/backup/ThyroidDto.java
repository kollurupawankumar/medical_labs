package app.dto.backup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThyroidDto {
    private String t3;
    private String t4;
    private String tsh;
    private String urineTest;

}
