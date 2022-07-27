package com.nexim.nexim.services.report.MDFIR920;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MDFIR920")
public class MDFIR920_DAO {
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
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate date_of_birth;
    @Column(name = "NATIONAL_ID_CARD_NUMBER")
    private String national_id_card_number;
    @Column(name = "PERMANENT_HOME_ADDRESS")
    private String permanent_home_address;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "STATE_CODE")
    private String state_code;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "DATE_TERMINATED_OR_DISMISSED")
    private LocalDate date_terminated_or_dismissed;
    @Column(name = "REASONS_FOR_TERMINATION")
    private String reasons_for_termination;
    @Column(name = "DATE_REINSTATED")
    private LocalDate date_reinstated;
    @Column(name = "REASON_FOR_REINSTATEMENT")
    private String reason_for_reinstatement;
    @Column(name = "ORGANISATION")
    private String organisation;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "DATE_FROM")
    private LocalDate date_from;
    @Column(name = "DATE_TO")
    private LocalDate date_to;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
