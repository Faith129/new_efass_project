package com.nexim.nexim.services.report.MDFIR600;

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
@Table(name = "MDFIR600")
public class MDFIR600_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "TERM_LOAN")
    private BigDecimal term_loan;
    @Column(name = "OVER_DRAFT")
    private BigDecimal over_draft;
    @Column(name = "OTHERS_1")
    private BigDecimal others_1;
    @Column(name = "ADVANCES_UNDER_LEASE")
    private BigDecimal advances_under_lease;
    @Column(name = "BANKERS_ACCEPTANCES")
    private BigDecimal bankers_acceptances;
    @Column(name = "COMMERCIAL_PAPERS")
    private BigDecimal commercial_papers;
    @Column(name = "BILLS_DISCOUNTED")
    private BigDecimal bills_discounted;
    @Column(name = "OTHERS_2")
    private BigDecimal others_2;
    @Column(name = "TOTAL")
    private BigDecimal totals;
    private LocalDate created_date;

}
