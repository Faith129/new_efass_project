package com.nexim.nexim.services.report.MDFIR1000;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;

public interface MDFIR1000_Services {
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse updateMDFIR1000(long id, MDFIR1000_Request dto) throws ResourceNotFoundException;
    ServiceResponse createMDFIR1000Report (MDFIR1000_Request request)throws ResourceNotFoundException;
    ServiceResponse findById(long id) throws ResourceNotFoundException;
    void deleteMDFIR1000(long id);
}
