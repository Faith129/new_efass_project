package com.nexim.nexim.services.report.MDFIR1920;

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
@Table(name = "MDFIR1920")
public class MDFIR1920_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "BRANCH_NAME")
    private String branch_name;
    @Column(name = "BRANCH_ADDRESS")
    private String branch_address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "DATE_OPENED")
    private LocalDate date_opened;
    @Column(name = "TOTAL_STAFF")
    private BigDecimal total_staff;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
