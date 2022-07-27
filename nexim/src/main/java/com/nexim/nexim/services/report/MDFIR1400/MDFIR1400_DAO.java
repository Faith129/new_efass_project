package com.nexim.nexim.services.report.MDFIR1400;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MDFIR1400")
public class MDFIR1400_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "BRANCH_NAME")
    private String branch_name;
    @Column(name = "TOTAL_OTHER_ASSETS")
    private String total_other_assets;
    @Column(name = "TOTAL_NON_OTHER_PERFORMING_ASSETS")
    private BigDecimal total_non_other_performing_assets;
    @Column(name = "WATCH_LIST")
    private BigDecimal watch_list;
    @Column(name = "SUBSTANDARD")
    private BigDecimal substandard;
    @Column(name = "DOUBTFUL")
    private BigDecimal doubtful;
    @Column(name = "VERY_DOUBTFUL")
    private BigDecimal very_doubtful;
    @Column(name = "LOST")
    private BigDecimal lost;
    @Column(name = "DFI_PROVISION")
    private String  dfi_provision;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
