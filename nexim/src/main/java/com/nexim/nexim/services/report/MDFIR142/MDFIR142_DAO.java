package com.nexim.nexim.services.report.MDFIR142;

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
@Table(name = "MDFIR142")
public class MDFIR142_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "INSTITUTION_CODE")
    private Long institution_code;
    @Column(name = "NAME_OF_INSTITUTION")
    private String name_of_institution;
    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
