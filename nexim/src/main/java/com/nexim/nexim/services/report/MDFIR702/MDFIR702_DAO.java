package com.nexim.nexim.services.report.MDFIR702;

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
@Table(name = "MDFIR702")
public class MDFIR702_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
