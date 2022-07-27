package com.nexim.nexim.services.report.MDFIR1650;

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
@Table(name = "MDFIR1650")
public class MDFIR1650 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "CUSTOMER_CODE")
    private String customer_Code;
    @Column(name = "CUSTOMER_NAME")
    private String customer_name;
    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;
    @Column(name = "RELATIONSHIP_TO_INSTITUTION")
    private String relationship_to_institution;
    @Column(name = "AMOUNT_GRANTED")
    private BigDecimal amount_granted;
    @Column(name = "DATE_GRANTED")
    private LocalDate date_granted;
    @Column(name = "EXPIRY_DATE")
    private LocalDate expiry_date;
    @Column(name = "TOTAL_OUTSTANDING_CREDIT")
    private String total_outstanding_credit;
    @Column(name = "PERFORMING")
    private String performing;
    @Column(name = "NON_PERFORMING")
    private String non_performing;
    @Column(name = "RATE_OF_INTEREST")
    private String rate_of_interest;
    @Column(name = "NATURE")
    private String nature;
    @Column(name = "VALUE")
    private BigDecimal value;
    @Column(name = "DATE_OF_VALUATION")
    private LocalDate date_of_valuation;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
