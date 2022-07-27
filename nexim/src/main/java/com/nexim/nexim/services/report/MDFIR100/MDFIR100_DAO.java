package com.nexim.nexim.services.report.MDFIR100;

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
@Table(name = "MDFIR100")
public class MDFIR100_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "NUMBER_1")
    private String number_1;
    @Column(name = "VALUE_1")
    private BigDecimal value_1;
    @Column(name = "NUMBER_2")
    private String number_2;
    @Column(name = "VALUE_2")
    private BigDecimal value_2;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
