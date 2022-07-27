package com.nexim.nexim.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nexim.nexim.services.report.MDFIR300.MDFIR300_DAO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportResponse {
    public int responseCode;
    public String responseMessage;
    public ArrayList<String> columnNames;
    public MDFIR300_DAO mdfir300Data;
    public Iterable<MDFIR300_DAO> mdfir300;
}
