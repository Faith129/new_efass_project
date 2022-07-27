package com.nexim.nexim.services.report.MDFIR1700;

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
@Table(name = "MDFIR1700")
public class MDFIR1700_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SECTOR")
    private String sector;
    @Column(name = "CRMS_BORROWER_CODE")
    private String crms_borrower_code;
    @Column(name = "RC_OR_BR_OR_SR_NO")
    private String rc_or_br_or_sr_no;
    @Column(name = "TOTAL")
    private String total;
    @Column(name = "CLASSIFIED_AS_NPA")
    private String classified_as_npa;
    @Column(name = "INV")
    private String inv;
    @Column(name = "LIABILITIES")
    private BigDecimal liabilities;
    @Column(name = "TOTAL_EXPOSURE")
    private BigDecimal total_exposure;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
