package com.nexim.nexim.services.report.MDFIR363;


import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;
import org.springframework.http.ResponseEntity;

public interface MDFIR363_Services {
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse updateMDFIR363(Long id, MDFIR363_Request dto) throws ResourceNotFoundException;
    ServiceResponse createMDFIR363Report (MDFIR363_Request request)throws ResourceNotFoundException;
    ServiceResponse findById(Long id) throws ResourceNotFoundException;
    //ResponseEntity<?> deleteMDFIR363(Long id) throws ResourceNotFoundException;
    void deleteMDFIR363(Long id);
}
