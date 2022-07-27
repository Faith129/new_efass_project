package com.nexim.nexim.services.report.MDFIR700;

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
@Table(name = "MDFIR700")
public class MDFIR700_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "OUTSTANDING_AT_BEGINNING_OF_MONTH")
    private BigDecimal outstanding_at_beginning_of_month;
    @Column(name = "OUTSTANDING_AT_END_OF_MONTH")
    private BigDecimal outstanding_at_end_of_month;
    @Column(name = "AVERAGE_OPENING_AND_CLOSING_BALANCE")
    private BigDecimal average_opening_and_closing_balance;
    @Column(name = "PAID_INTEREST_DURING_THE_MONTH")
    private BigDecimal paid_interest_during_the_month;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
