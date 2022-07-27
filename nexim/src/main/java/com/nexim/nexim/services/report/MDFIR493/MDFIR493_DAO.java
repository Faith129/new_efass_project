package com.nexim.nexim.services.report.MDFIR493;

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
@Table(name = "MDFIR493")
public class MDFIR493_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "DATE_OF_PURCHASE")
    private LocalDate date_of_purchase;
    @Column(name = "DATE_TRANSFERRED_TO_HELD_FOR_SALE")
    private LocalDate date_transferred_to_held_for_sale;
    @Column(name = "PURCHASE_COST")
    private BigDecimal purchase_cost;
    @Column(name = "CURRENT_BOOK_VALUE")
    private BigDecimal current_book_value;
    @Column(name = "CURRENT_MARKET_VALUE")
    private BigDecimal current_market_value;
    @Column(name = "REVALUATION_GAIN_OR_LOSS")
    private BigDecimal revaluation_gain_or_loss;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
