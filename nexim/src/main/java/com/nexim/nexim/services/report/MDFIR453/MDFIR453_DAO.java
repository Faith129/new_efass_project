package com.nexim.nexim.services.report.MDFIR453;

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
@Table(name = "MDFIR453")
public class MDFIR453_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "COST")
    private BigDecimal cost;
    @Column(name = "IMPAIRMENT")
    private BigDecimal impairment;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
