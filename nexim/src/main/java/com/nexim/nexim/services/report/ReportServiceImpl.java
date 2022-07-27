package com.nexim.nexim.services.report;

import com.nexim.nexim.payload.ReportResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReportServiceImpl implements ReportServices {


    @Override
    public Boolean checkDate(LocalDate date) {
        return true;
    }

    @Override
    public ResponseEntity<?> NoDateFound() {
        ReportResponse res = new ReportResponse();
        res.setResponseMessage("Failed, Report Date Not Selected");
        res.setResponseCode(-1001);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }
}
