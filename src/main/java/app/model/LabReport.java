package app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lab_report")
@Data
public class LabReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reported_date")
    private LocalDateTime reportedDate;

    @Column(name = "wbc")
    private String wbc;

    @Column(name = "rbc")
    private String rbc;

    @Column(name = "hb")
    private String hb;

    @Column(name = "plc")
    private String plc;

    @Column(name = "pcv")
    private String pcv;

    @Column(name = "aec")
    private String aec;

    @Column(name = "poly_percentage")
    private String polyPercentage;

    @Column(name = "blood_group")
    private String group;

    @Column(name = "rh")
    private String rh;

    @Column(name = "fbs")
    private String fbs;

    @Column(name = "plbs")
    private String plbs;

    @Column(name = "rbs")
    private String rbs;

    @Column(name = "blood_urea")
    private String bloodUrea;

    @Column(name = "s_creatinie")
    private String SCreatinie;

    @Column(name = "s_uric_acid")
    private String sUricAcid;

    @Column(name = "sto")
    private String sto;

    @Column(name = "sth")
    private String sth;

    @Column(name = "sptAh")
    private String sptAh;

    @Column(name = "sptBh")
    private String sptBh;

    @Column(name = "dengue_ns1_antigen")
    private String dengueNS1Antigen;

    @Column(name = "malaria_parasite")
    private String malariaParasite;

    @Column(name = "micro_filaria")
    private String microFilaria;

    @Column(name = "s_cholesterol")
    private String sCholesterol;

    @Column(name = "s_triglycerides")
    private String sTriglycerides;

    @Column(name = "s_hld_cholesterol")
    private String sHldCholesterol;

    @Column(name = "s_lld_cholesterol")
    private String sLldCholesterol;

    @Column(name = "s_bilirubin_t")
    private String sBilirubinT;

    @Column(name = "s_bilirubin_d")
    private String sBilirubinD;

    @Column(name = "sg_ot")
    private String sgOt;

    @Column(name = "sg_pt")
    private String sgPt;

    @Column(name = "s_alkaline_phosphatase")
    private String sAlkalinePhosphatase;

    @Column(name = "total_proteins")
    private String totalProteins;

    @Column(name = "s_albumin")
    private String sAlbumin;

    @Column(name = "ag_ratio")
    private String agRatio;

    @Column(name = "ra_test")
    private String raTest;

    @Column(name = "aso")
    private String aso;

    @Column(name = "crp")
    private String crp;

    @Column(name = "hiv")
    private String hiv;

    @Column(name = "hbs_ag")
    private String hbsAg;

    @Column(name = "hcv")
    private String hcv;

    @Column(name = "t3")
    private String t3;

    @Column(name = "t4")
    private String t4;

    @Column(name = "tsh")
    private String tsh;

    @Column(name = "urine_test")
    private String urineTest;

    @Column(name = "albumin")
    private String albumin;

    @Column(name = "sugar")
    private String sugar;

    @Column(name = "bile_salts")
    private String bileSalts;

    @Column(name = "bile_pigments")
    private String bilePigments;

    @Column(name = "urobilinogen")
    private String urobilinogen;

    @Column(name = "blood")
    private String blood;

    @Column(name = "urine_test_for_pregnancy")
    private String urineTestForPregnancy;

    @Column(name = "pus_cells")
    private String pusCells;

    @Column(name = "epith_cells")
    private String epithCells;

    @Column(name = "micro_rbc")
    private String microRbc;

    @Column(name = "casts")
    private String casts;

    @Column(name = "others")
    private String others;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
