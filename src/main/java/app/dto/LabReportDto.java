package app.dto;

import app.model.LabReport;
import app.model.Patient;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class LabReportDto {

    private Long id;
    private Long patientId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime reportedDate;
    private String wbc;
    private String rbc;
    private String hb;
    private String plc;
    private String pcv;
    private String aec;
    private String polyPercentage;
    private String group;
    private String rh;
    private String fbs;
    private String plbs;
    private String rbs;
    private String bloodUrea;
    private String SCreatinie;
    private String sUricAcid;
    private String sto;
    private String sth;
    private String sptAh;
    private String sptBh;
    private String dengueNS1Antigen;
    private String malariaParasite;
    private String microFilaria;
    private String sCholesterol;
    private String sTriglycerides;
    private String sHldCholesterol;
    private String sLldCholesterol;
    private String sBilirubinT;
    private String sBilirubinD;
    private String sgOt;
    private String sgPt;
    private String sAlkalinePhosphatase;
    private String totalProteins;
    private String sAlbumin;
    private String agRatio;
    private String raTest;
    private String aso;
    private String crp;
    private String hiv;
    private String hbsAg;
    private String hcv;
    private String t3;
    private String t4;
    private String tsh;
    private String urineTest;
    private String albumin;
    private String sugar;
    private String bileSalts;
    private String bilePigments;
    private String urobilinogen;
    private String blood;
    private String urineTestForPregnancy;
    private String pusCells;
    private String epithCells;
    private String microRbc;
    private String casts;
    private String others;

    public LabReportDto(LabReport labReport) {
        BeanUtils.copyProperties(labReport, this, "patientId");

        Patient patient = labReport.getPatient();
        if (patient != null) {
            this.patientId = patient.getId();
        }
    }
}
