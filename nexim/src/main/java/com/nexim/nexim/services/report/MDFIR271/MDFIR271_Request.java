package com.nexim.nexim.services.report.MDFIR271;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@Builder
public class MDFIR271_Request {
    private String name_of_institution;
    private String institution_code;
    private String account_number;
    private BigDecimal amount;
    private String remarks;
}
