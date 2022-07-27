package com.nexim.nexim.services.report.MDFIR1300;

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
@Table(name = "MDFIR1300")
public class MDFIR1300_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "CUSTOMER_CODE")
    private String customer_code;
    @Column(name = "CUSTOMER_NAME")
    private String customer_name;
    @Column(name = "TOTAL_CREDIT")
    private BigDecimal total_credit;
    @Column(name = "PRINCIPAL_PAYMENT_DUE_AND_UNPAID")
    private BigDecimal principal_payment_due_and_unpaid;
    @Column(name = "ACCRUED_INTEREST_UNPAID")
    private BigDecimal accrued_interest_unpaid;
    @Column(name = "TOTAL_OUTSTANDING_CREDITS")
    private BigDecimal total_outstanding_credits;
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
