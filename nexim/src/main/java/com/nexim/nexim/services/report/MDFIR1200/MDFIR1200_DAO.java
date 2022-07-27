package com.nexim.nexim.services.report.MDFIR1200;

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
@Table(name = "MDFIR1200")
public class MDFIR1200_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "FROM_1_TO_100000")
    private BigDecimal from_1_to_100000;
    @Column(name = "FROM_100001_TO_200000")
    private BigDecimal from_100001_to_200000;
    @Column(name = "FROM_200001_TO_500000")
    private BigDecimal from_200001_to_500000;
    @Column(name = "OVER_500000")
    private BigDecimal over_500000;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
