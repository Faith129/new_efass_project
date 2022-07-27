package com.nexim.nexim.services.report.MDFIR223;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MDFIR223")
public class MDFIR223_DAO {
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
    @Column(name = "FAIR_VALUE_GAIN_OR_LOSSES")
    private BigDecimal fair_value_gain_or_losses;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "CARRYING_AMOUNT_QUOTED_EQUITY_INVESTMENT")
    private BigDecimal carrying_amount_quoted_equity_investment;
    @Column(name = "CREATED_DATE")
    private String created_date;

}
