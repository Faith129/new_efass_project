package com.nexim.nexim.services.report.MDFIR400_10;

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
@Table(name = "MDFIR400_10")
public class MDFIR400_10_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "AMOUNT_INVESTED")
    private BigDecimal amount_invested;
    @Column(name = "INVESTED_CERTIFICATE_NUMBER")
    private String invested_certificate_number;
    @Column(name = "TENOR")
    private String tenor;
    @Column(name = "EFFECTIVE_DATE")
    private LocalDate effective_date;
    @Column(name = "MATURITY_DATE")
    private LocalDate maturity_date;
    @Column(name = "INTEREST_RATE")
    private BigDecimal interest_rate;
    @Column(name = "UPFRONT_INTEREST_PAID")
    private BigDecimal upfront_interest_paid;
    @Column(name = "ACCRUED_INTEREST_PAYABLE")
    private BigDecimal accrued_int_payable;
    @Column(name = "TIMES_ROLLED_OVER")
    private String times_rolled_over;
    @Column(name = "PRINCIPLE_PAYABLE")
    private BigDecimal principle_payable;
    @Column(name = "TOTAL_PRINCIPAL_ACCRUED_INTEREST")
    private BigDecimal total_principal_interest;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "NET_PRINCIPAL")
    private BigDecimal net_principal;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
