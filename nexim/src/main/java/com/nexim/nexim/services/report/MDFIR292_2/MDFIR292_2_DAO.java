package com.nexim.nexim.services.report.MDFIR292_2;

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
@Table(name = "MDFIR292_2")
public class MDFIR292_2_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DERIVATIVE_FINANCIAL_LIABILITIES")
    private String derivative_financial_liabilities;
    @Column(name = "NOTIONAL_AMOUNT")
    private BigDecimal notional_amount;
    @Column(name = "CARRYING_VALUE")
    private BigDecimal carrying_value;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
