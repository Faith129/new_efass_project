package com.nexim.nexim.services.report;

import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

public interface ReportServices {
    Boolean checkDate(LocalDate date);
   ResponseEntity<?> NoDateFound();
   // public ResponseEntity<?> selectDate(LocalDate since);

}
