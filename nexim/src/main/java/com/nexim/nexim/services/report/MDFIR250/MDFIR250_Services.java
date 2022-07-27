package com.nexim.nexim.services.report.MDFIR250;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;

public interface MDFIR250_Services {
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse updateMDFIR250(long id, MDFIR250_Request dto) throws ResourceNotFoundException;
}
