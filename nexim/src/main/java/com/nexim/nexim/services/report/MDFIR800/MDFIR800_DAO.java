package com.nexim.nexim.services.report.MDFIR800;

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
@Table(name = "MDFIR800")
public class MDFIR800_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DEMAND")
    private BigDecimal demand;
    @Column(name = "SAVING")
    private BigDecimal saving;
    @Column(name = "UP_TO_90_DAYS")
    private BigDecimal up_to_90_days;
    @Column(name = "SCHEDULE_91_180_DAYS")
    private BigDecimal schedule_91_81_days;
    @Column(name = "SCHEDULE_181_365_DAYS")
    private BigDecimal schedule_181_365_days;
    @Column(name = "OVER_365_DAYS")
    private BigDecimal over_365_days;
    @Column(name = "TOTAL_DEP")
    private BigDecimal total_DEP;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
