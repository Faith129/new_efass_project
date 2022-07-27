package com.nexim.nexim.services.report.MDFIR1950;

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
@Table(name = "MDFIR1950")
public class MDFIR1950_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "FULL_NAME")
    private String full_name;
    @Column(name = "HOME_ADDRESS")
    private String home_address;
    @Column(name = "PHONE_NUMBER")
    private String phone_number;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "BIRTH_DATE")
    private LocalDate birth_date;
    @Column(name = "ACADEMIC_QUALIFICATION")
    private String academic_qualification;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "DATE_APPOINTED")
    private LocalDate date_appointed;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
