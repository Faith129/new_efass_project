package com.nexim.nexim.services.report.MDFIR291;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class MDFIR291_Request {
    private String name_of_bank;
    private int institution_code;
    private String type_of_placements;
    private String account_number;
    private BigDecimal amount_1;
    private BigDecimal amount_2;
    private String tenor;
    private LocalDate effective_date;
    private LocalDate maturity_date;
    private String interest_rate;
    private String upfront_interest_received;
    private String accrued_interest_receivable;
    private String times_rolled_over;
}
