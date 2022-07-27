package com.nexim.nexim.services.report.MDFIR250;

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
@Table(name = "MDFIR250")
public class MDFIR250_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ITEM_DESCRIPTION")
    private String item_description;
    @Column(name = "PERCENTAGE")
    private String percentage;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;

}
