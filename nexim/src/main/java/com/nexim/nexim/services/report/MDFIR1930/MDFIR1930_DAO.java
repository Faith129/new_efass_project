package com.nexim.nexim.services.report.MDFIR1930;

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
@Table(name = "MDFIR1930")
public class MDFIR1930_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "LAST_NAME")
    private String last_name;
    @Column(name = "MIDDLE_NAME")
    private String middle_name;
    @Column(name = "FIRST_NAME")
    private String first_name;
    @Column(name = "OFFICE_ADDRESS")
    private String office_address;
    @Column(name = "OFFICE_PHONE")
    private String office_phone;
    @Column(name = "HOME_ADDRESS")
    private String home_address;
    @Column(name = "HOME_PHONE")
    private String home_phone;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "BIRTH_DATE")
    private LocalDate birth_date;
    @Column(name = "PROFS")
    private String profs;
    @Column(name = "ACADEMIC_QUALIFICATION")
    private String academic_qualification;
    @Column(name = "DATE_APPOINTED")
    private String date_appointed;
    @Column(name = "MODE_OF_APPOINTMENT")
    private String mode_of_appointment;
    @Column(name = "EXEC_OR_NON_EXEC")
    private String exec_or_non_exec;
    @Column(name = "NAME_OF_RELATED_COMPANIES")
    private String name_of_related_companies;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "RC_OR_BR_OR_SR_NO")
    private String rc_or_br_or_sr_no;
    @Column(name = "CRMS_NO")
    private String crms_no;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
