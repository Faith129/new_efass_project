package com.nexim.nexim.services.report.MDFIR900;

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
@Table(name = "MDFIR900")
public class MDFIR900_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "CUSTOMER_CODE")
    private String customer_code;
    @Column(name = "CUSTOMER_NAME")
    private String customer_name;
    @Column(name = "TYPE_OF_FACILITY")
    private String type_of_facility;
    @Column(name = "AMOUNT_GRANTED")
    private BigDecimal amount_granted;
    @Column(name = "DATE_GRANTED")
    private LocalDate date_granted;
    @Column(name = "EXPIRY_DATE")
    private LocalDate expiry_date;
    @Column(name = "UNUTILISED_CREDIT")
    private BigDecimal unutilized_CREDIT;
    @Column(name = "OUTSTANDING_CREDIT")
    private BigDecimal outstanding_credit;
    @Column(name = "DEBT_INSTRUMENTS")
    private BigDecimal debt_instruments;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_UTILIZATION_ON_EXCEEDED_LIMIT")
    private LocalDate date_utilization_on_exceeded_limit;
    @Column(name = "CBN_APPROVAL")
    private String cbn_approval;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
