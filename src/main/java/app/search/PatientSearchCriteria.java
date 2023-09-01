package app.search;

import app.common.search.BaseSearchCriteria;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PatientSearchCriteria extends BaseSearchCriteria {

    public static final String ORDER_BY_ID = "id";
    public static final String ORDER_BY_NAME = "patientName";
    public static final String DEFAULT_ORDER_BY = ORDER_BY_ID;

    private Long id;
    private String patientName;
    private int age;
    private String phone;
    private String gender;
    private String address;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime opDate;
    private String fatherName;
    private String identity;
}
