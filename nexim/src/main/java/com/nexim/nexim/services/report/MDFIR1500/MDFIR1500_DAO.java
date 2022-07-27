package com.nexim.nexim.services.report.MDFIR1500;

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
@Table(name = "MDFIR1500")
public class MDFIR1500_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "BRANCH_NAME")
    private String branch_name;
    @Column(name = "TOTAL_VALUE_OF_CONTINGENT_LIABILITY")
    private BigDecimal total_value_of_contingent_liabilities;
    @Column(name = "TOTAL_IMPAIRED_CONTINGENT_LIABILITY")
    private BigDecimal total_impaired_contingent_liabilities;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
