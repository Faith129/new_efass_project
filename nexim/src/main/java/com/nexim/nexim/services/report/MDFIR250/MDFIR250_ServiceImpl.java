package com.nexim.nexim.services.report.MDFIR250;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;

import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MDFIR250_ServiceImpl implements MDFIR250_Services {
    @Autowired
    private MDFIR250_Repository mdfir250_repository;

    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<MDFIR250_DAO> MDFIR250List = mdfir250_repository.findAll();
        String message = !MDFIR250List.isEmpty() ? "Record found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR250List).build();
    }

    @Override
    public ServiceResponse updateMDFIR250(long id, MDFIR250_Request dto) throws ResourceNotFoundException {
        MDFIR250_DAO MDFIR250_dao = mdfir250_repository.findById(id).get();
        if (mdfir250_repository.findById(id).isPresent()) {
            MDFIR250_dao.setItem_description(dto.getItem_description());
            MDFIR250_dao.setPercentage(dto.getPercentage());
            MDFIR250_dao.setCreated_date(LocalDate.now());
        }

        return mdfir250_repository.findById(id).map(updateMdfir250 -> {
            mdfir250_repository.save(updateMdfir250);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "id with id" + id +
            "does not exist"));
    }
}
