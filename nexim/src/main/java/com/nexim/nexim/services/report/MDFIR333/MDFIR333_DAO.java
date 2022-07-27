package com.nexim.nexim.services.report.MDFIR333;

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
@Table(name = "MDFIR333")
public class MDFIR333_DAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "INVESTEE_NAME")
    private String investee_name;
    @Column(name = "TYPE_OF_INVESTMENT")
    private String type_of_investment;
    @Column(name = "INVESTMENT_CERTIFICATE_NUMBER")
    private String investment_certificate_number;
    @Column(name = "AMOUNT_INVESTED")
    private BigDecimal amount_invested;
    @Column(name = "FAIR_VALUE_GAINS")
    private BigDecimal fair_value_gains;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "CARRYING_VALUE_UNQUOTED_EQUITY_INVESTMENT")
    private BigDecimal carrying_value_unquoted_equity_investment;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
