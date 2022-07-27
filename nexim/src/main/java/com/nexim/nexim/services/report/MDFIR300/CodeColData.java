package com.nexim.nexim.services.report.MDFIR300;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeColData {

    public Long id;

    public ArrayList<String> value;

    public String code;


}
