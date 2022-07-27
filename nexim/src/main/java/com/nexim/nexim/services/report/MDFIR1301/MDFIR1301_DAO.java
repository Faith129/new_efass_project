package com.nexim.nexim.services.report.MDFIR1301;

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
@Table(name = "MDFIR1301")
public class MDFIR1301_DAO {
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
    @Column(name = "TOTAL_IMPAIRED_CREDITS")
    private BigDecimal total_impaired_credits;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
