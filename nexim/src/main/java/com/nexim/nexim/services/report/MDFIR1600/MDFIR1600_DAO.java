package com.nexim.nexim.services.report.MDFIR1600;

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
@Table(name = "MDFIR1600")
public class MDFIR1600_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "LOAN_OR_FACILITIES_TYPE")
    private String loan_or_facilities_type;
    @Column(name = "AGGREGATE_AMOUNT_PRINCIPAL")
    private BigDecimal aggregate_amount_principal;
    @Column(name = "AGGREGATE_AMOUNT_ACCRUED_INTEREST")
    private BigDecimal aggregate_amount_accrued_interest;
    @Column(name = "AGGREGATE_AMOUNT_TOTAL_OUTSTANDING")
    private BigDecimal aggregate_amount_total_outstanding;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
