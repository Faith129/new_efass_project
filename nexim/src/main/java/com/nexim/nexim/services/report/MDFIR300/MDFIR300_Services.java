package com.nexim.nexim.services.report.MDFIR300;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;
import org.springframework.http.ResponseEntity;

public interface MDFIR300_Services {
    ResponseEntity<?> getDataById(long dataId) throws ResourceNotFoundException;
        ResponseEntity<?> findAllMDFIR300();
    ResponseEntity<?>  updateMDFIR300(String code, MDFIR300_DAO dto) throws ResourceNotFoundException;
    ServiceResponse createMDFIR300Report (MDFIR300_Request request)throws ResourceNotFoundException;
    ServiceResponse findById(long id) throws ResourceNotFoundException;
    void deleteMDFIR300(long id);

}
