package com.nexim.nexim.services.report.MDFIR921;

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
@Table(name = "MDFIR921")
public class MDFIR921_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "FIRST_NAME")
    private String first_name;
    @Column(name = "MIDDLE_NAME")
    private String middle_name;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate date_of_birth;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "STATE_OF_ORIGIN")
    private String state_of_origin;
    @Column(name = "PASSPORT_NUMBER")
    private String passport_number;
    @Column(name = "NATIONAL_ID_CARD_NUMBER")
    private String national_id_card_number;
    @Column(name = "BRANCH_NAME")
    private String branch_name;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "STATE_CODE")
    private String state_code;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "DATE_OF_FRAUD")
    private LocalDate date_of_fraud;
    @Column(name = "DATE_DISCOVERED")
    private LocalDate date_discovered;
    @Column(name = "AMOUNT_INVOLVED")
    private BigDecimal amount_involved;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "AMOUNT_RECOVERED")
    private BigDecimal amount_recovered;
    @Column(name = "ACTUAL_LOSS")
    private BigDecimal actual_loss;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
