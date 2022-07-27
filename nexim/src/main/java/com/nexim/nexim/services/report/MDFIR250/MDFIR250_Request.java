package com.nexim.nexim.services.report.MDFIR250;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MDFIR250_Request {
    private String item_description;
    private String percentage;
}
