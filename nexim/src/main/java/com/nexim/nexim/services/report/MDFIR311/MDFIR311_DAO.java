package com.nexim.nexim.services.report.MDFIR311;

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
@Table(name = "MDFIR311")
public class MDFIR311_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "NAME_OF_BANK")
    private String name_of_bank;
    @Column(name = "INSTITUTION_CODE")
    private String institution_code;
    @Column(name = "TYPE_OF_PLACEMENTS")
    private String type_of_placements;
    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;
    @Column(name = "AMOUNT_1")
    private BigDecimal amount_1;
    @Column(name = "AMOUNT_2")
    private BigDecimal amount_2;
    @Column(name = "TENOR")
    private String tenor;
    @Column(name = "EFFECTIVE_DATE")
    private LocalDate effective_date;
    @Column(name = "MATURITY_DATE")
    private LocalDate maturity_date;
    @Column(name = "INTEREST_RATE")
    private String interest_rate;
    @Column(name = "ACCRUED_INTEREST_RECEIVABLE")
    private String accrued_interest_receivable;
    @Column(name = "TIMES_ROLLED_OVER")
    private String times_rolled_over;
    @Column(name = "REMARKS")
    private BigDecimal remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
