package com.nexim.nexim.services.report.MDFIR533;

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
@Table(name = "MDFIR533")
public class MDFIR533_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "GROSS_AMOUNT")
    private BigDecimal gross_amount;
    @Column(name = "ADDITIONS")
    private BigDecimal  additions;
    @Column(name = "ACCUMULATED_DEPRECIATION")
    private BigDecimal accumulated_depreciation ;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment ;
    @Column(name = "CARRYING_AMOUNT")
    private BigDecimal carrying_amount ;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
