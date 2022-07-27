package com.nexim.nexim.services.report.MDFIR271;


import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;

public interface MDFIR271_Services {
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse updateMDFIR271(long id, MDFIR271_Request dto) throws ResourceNotFoundException;
    ServiceResponse createReport (MDFIR271_Request request)throws ResourceNotFoundException;
}
