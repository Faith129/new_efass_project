package com.nexim.nexim.services.report.MDFIR1910;

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
@Table(name = "MDFIR1910")
public class MDFIR1910_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "INSTANT_CODE")
    private String instant_code;
    @Column(name = "INSTANT_NAME")
    private String instant_name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "LICENCE_NO")
    private String licence_no;
    @Column(name = "TELEPHONE_1")
    private String telephone_1;
    @Column(name = "TELEPHONE_2")
    private String telephone_2;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "NUMBER_OF_BRANCHES")
    private String number_of_branches;
    @Column(name = "LAST_DATE_OF_CBN_EXAM")
    private LocalDate last_date_of_cbn_exam;
    @Column(name = "NUMBER_OF_SENIOR_STAFF")
    private String number_of_senior_staff;
    @Column(name = "NUMBER_OF_JUNIOR_STAFF")
    private String number_of_junior_staff;
    @Column(name = "AUDIT_FIRM")
    private String audit_firm;
    @Column(name = "AUDIT_FIRM_ADDRESS")
    private String audit_firm_address;
    @Column(name = "INSTANT_EMAIL_ADDRESS")
    private String instant_email_address;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
