package com.nexim.nexim.services.report.MDFIR291;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;

public interface MDFIR291_Services {
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse updateMDFIR291(long id, MDFIR291_Request dto) throws ResourceNotFoundException;
}
