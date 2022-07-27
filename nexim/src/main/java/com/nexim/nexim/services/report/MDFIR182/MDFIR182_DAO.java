package com.nexim.nexim.services.report.MDFIR182;

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
@Table(name = "MDFIR182")
public class MDFIR182_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "INSTITUTION_CODE")
    private String institution_code;
    @Column(name = "NAME_OF_INSTITUTION")
    private String name_of_institution;
    @Column(name = "ACCOUNT_NUMBER")
    private String account_no;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
