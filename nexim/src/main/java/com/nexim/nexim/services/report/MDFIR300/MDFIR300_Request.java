package com.nexim.nexim.services.report.MDFIR300;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@Builder
public class MDFIR300_Request {
    private String item_description;
    private BigDecimal amount;
}
