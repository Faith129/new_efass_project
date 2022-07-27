package com.nexim.nexim.services.report.MDFIR363;

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
@Table(name = "MDFIR363")
public class MDFIR363_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "TYPE_OF_INVESTMENT")
    private String type_of_investment;
    @Column(name = "PERCENTAGE_1")
    private String percentage_1;
    @Column(name = "QUOTED_1")
    private BigDecimal quoted_1;
    @Column(name = "UNQUOTED_1")
    private BigDecimal unquoted_1;
    @Column(name = "PERCENTAGE_2")
    private String percentage_2;
    @Column(name = "QUOTED_2")
    private BigDecimal quoted_2;
    @Column(name = "UNQUOTED_2")
    private BigDecimal unquoted_2;
    @Column(name = "QUOTED_3")
    private BigDecimal quoted_3;
    @Column(name = "UNQUOTED_3")
    private BigDecimal unquoted_3;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "NET_AMOUNT")
    private BigDecimal net_amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
