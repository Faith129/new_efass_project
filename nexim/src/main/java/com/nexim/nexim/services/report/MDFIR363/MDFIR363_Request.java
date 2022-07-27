package com.nexim.nexim.services.report.MDFIR363;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class MDFIR363_Request {
    private String type_of_investment;
    private String percentage_1;
    private BigDecimal quoted_1;
    private BigDecimal unquoted_1;
    private String percentage_2;
    private BigDecimal quoted_2;
    private BigDecimal unquoted_2;
    private BigDecimal quoted_3;
    private BigDecimal unquoted_3;
    private BigDecimal impairment;
    private BigDecimal net_amount;
}
