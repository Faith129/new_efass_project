package com.nexim.nexim.services.report.MSTDR_1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MSTDR1_1")
public class MSTDR_1_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "STATE_CODE")
    private String state_code;
    @Column(name = "LOCAL_GOVERNMENTS_OR_LG_CODE")
    private String local_government_or_lg_code;
    @Column(name = "UP_TO_2_YRS")
    private String up_to_2_yrs;
    @Column(name = "2_T0_5_YRS")
    private String schedule_2_to_5_yrs;
    @Column(name = "5_T0_10_YRS")
    private String schedule_5_to_10_yrs;
    @Column(name = "OVER_10YRS")
    private String over_10yrs;
    @Column(name = "OVER_DRAFT")
    private String over_draft;
    @Column(name = "OTHERS")
    private String others;
    @Column(name = "TOTAL")
    private String total;
    @Column(name = "UP_TO_2_YRS_1")
    private String up_to_2_yrs_1;
    @Column(name = "2_T0_5_YRS_1")
    private String schedule_2_to_5_yrs_1;
    @Column(name = "5_T0_10_YRS_1")
    private String schedule_5_to_10_yrs_1;
    @Column(name = "OVER_10YRS_1")
    private String over_10yrs_1;
    @Column(name = "TOTAL_1")
    private String total_1;
}
