package com.nexim.nexim.services.report.MDFIR601;

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
@Table(name = "MDFIR601")
public class MDFIR601_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "CUSTOMER_NAME")
    private String customer_name;
    @Column(name = "DATE_APPROVED")
    private LocalDate date_approved;
    @Column(name = "FOREIGN_CURRENCY")
    private String foreign_currency;
    @Column(name = "RATE_OF_EXCHANGE")
    private String rate_of_exchange;
    @Column(name = "APPROVED_LIMIT")
    private BigDecimal approved_limit;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
