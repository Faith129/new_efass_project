package com.nexim.nexim.services.report.MCFPR1;

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
@Table(name = "MCFPR1")
public class MCFPR1_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "NAME_OF_PETITIONER")
    private String name_of_petitioner;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "DATE_RECEIVED")
    private LocalDate date_received;
    @Column(name = "DATE_RESOLVED")
    private LocalDate date_resolved;
    @Column(name = "RESOLUTION_EFFORTS_MADE")
    private String resolution_efforts_made;
    @Column(name = "MAJOR_AREAS_OF_DISAGREEMENT")
    private String major_areas_of_disagreement;
    @Column(name = "AMOUNT_CLAIMED_1")
    private BigDecimal amount_claimed_1;
    @Column(name = "AMOUNT_REFUNDED_1")
    private BigDecimal amount_refunded_1;
    @Column(name = "AMOUNT_CLAIMED_2")
    private BigDecimal amount_claimed_2;
    @Column(name = "AMOUNT_REFUNDED_2")
    private BigDecimal amount_refunded_2;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
   }
