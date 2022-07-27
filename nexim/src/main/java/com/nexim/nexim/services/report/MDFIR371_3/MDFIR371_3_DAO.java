package com.nexim.nexim.services.report.MDFIR371_3;

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
@Table(name = "MDFIR371_3")
public class MDFIR371_3_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "DERIVATIVE_FINANCIAL_ASSETS")
    private String derivative_financial_assets;
    @Column(name = "NOTIONAL_AMOUNT")
    private BigDecimal notional_amount;
    @Column(name = "CARRYING_VALUE")
    private BigDecimal carrying_value;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
