package com.nexim.nexim.services.report.MDFIR1000;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class MDFIR1000_Request {
    private String item_description;
    private BigDecimal current_month;
    private BigDecimal year_to_date;
}
