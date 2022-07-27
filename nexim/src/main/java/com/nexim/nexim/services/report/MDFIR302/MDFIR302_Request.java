package com.nexim.nexim.services.report.MDFIR302;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MDFIR302_Request {
    private String itemCode;
    private String values;
}
