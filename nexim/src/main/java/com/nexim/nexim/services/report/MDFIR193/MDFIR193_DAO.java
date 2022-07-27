package com.nexim.nexim.services.report.MDFIR193;

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
@Table(name = "MDFIR193")
public class MDFIR193_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "AMOUNT_CURRENT_MONTH")
    private BigDecimal amount_current_month;
    @Column(name = "AMOUNT_YEAR_TO_DATE")
    private BigDecimal amount_year_to_year;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
