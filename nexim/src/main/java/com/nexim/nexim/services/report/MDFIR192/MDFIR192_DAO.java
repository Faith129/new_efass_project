package com.nexim.nexim.services.report.MDFIR192;

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
@Table(name = "MDFIR192")
public class MDFIR192_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "INSTITUTION_CODE")
    private String institution_code;
    @Column(name = "NAME_OF_INSTITUTION")
    private String name_of_institution;
    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;
    @Column(name = "FOREIGN_CURRENCY")
    private String foreign_currency;
    @Column(name = "RATE_OF_EXCHANGE")
    private String rate_of_exchange;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
