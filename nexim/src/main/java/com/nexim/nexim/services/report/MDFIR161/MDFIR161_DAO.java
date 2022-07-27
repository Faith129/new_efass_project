package com.nexim.nexim.services.report.MDFIR161;

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
@Table(name = "MDFIR161")
public class MDFIR161_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "NAME_OF_INSTITUTION")
    private String name_of_institution;
    @Column(name = "INSTITUTION_CODE")
    private String institution_code;
    @Column(name = "TYPE_OF_BALANCE")
    private String type_of_balance;
    @Column(name = "ACCOUNT_NO")
    private String account_no;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
