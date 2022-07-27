package com.nexim.nexim.services.report.MDFIR382;

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
@Table(name = "MDFIR382")
public class MDFIR382_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "CUSTOMER_CODE")
    private String customer_code;
    @Column(name = "CUSTOMER_NAME")
    private String customer_name;
    @Column(name = "PRINCIPAL_GRANTED")
    private String principal_granted;
    @Column(name = "PURPOSE")
    private String purpose;
    @Column(name = "DATE_GRANTED")
    private LocalDate date_granted;
    @Column(name = "DUE_DATE")
    private LocalDate due_date;
    @Column(name = "PRINCIPAL_OUTSTANDING")
    private String principal_outstanding;
    @Column(name = "INTEREST_RATE")
    private BigDecimal interest_rate;
    @Column(name = "UPFRONT_INTEREST")
    private BigDecimal upfront_interest;
    @Column(name = "INTEREST_PAYABLE")
    private BigDecimal interest_payable;
    @Column(name = "UNPAID_PRINCIPAL_INTEREST")
    private BigDecimal unpaid_principal_interest;
    @Column(name = "TIMES_ROLLED_OVER")
    private String times_rolled_over;
    @Column(name = "COLL_OR_VALUE")
    private BigDecimal coll_or_value;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
