package com.nexim.nexim.services.report.MDFIR1960;

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
@Table(name = "MDFIR1960")
public class MDFIR1960_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "BRANCH_CODE")
    private String branch_code;
    @Column(name = "BRANCH_NAME")
    private String branch_name;
    @Column(name = "DATE_OPENED")
    private LocalDate date_opened;
    @Column(name = "DATE_CLOSED")
    private LocalDate date_closed;
    @Column(name = "CBN_APPROVAL_DATE")
    private LocalDate cbn_approval_date;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
