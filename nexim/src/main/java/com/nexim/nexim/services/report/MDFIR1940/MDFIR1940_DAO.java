package com.nexim.nexim.services.report.MDFIR1940;

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
@Table(name = "MDFIR1940")
public class MDFIR1940_DAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "SHAREHOLDER_NAME")
    private String shareholder_name;
    @Column(name = "SHAREHOLDER_ADDRESS")
    private String shareholder_address;
    @Column(name = "STATE_OF_ORIGIN")
    private String state_of_origin;
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate date_Of_birth;
    @Column(name = "RC_OR_BR_OR_SR_NO")
    private String rc_or_br_or_sr_no;
    @Column(name = "EQUITY_INTEREST")
    private String equity_interest;
    @Column(name = "NO_OF_SHARES_HELD")
    private String no_of_shares_held;
    @Column(name = "CREATED_DATE")
    private LocalDate created_date;
}
