package com.nexim.nexim.services.report.MDFIR271;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ServiceResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class MDFIR271_ServiceImpl implements MDFIR271_Services {

    @Autowired
    private MDFIR271_Repository mdfir271_repository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<MDFIR271_DAO> MDFIR271List = mdfir271_repository.findAll();
        String message = !MDFIR271List.isEmpty() ? "Record found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR271List).build();
    }

    @Override
    public ServiceResponse updateMDFIR271(long id, MDFIR271_Request dto) throws ResourceNotFoundException {
        MDFIR271_DAO mdfir271_dao = mdfir271_repository.findById(id).get();
        if (mdfir271_repository.findById(id).isPresent()) {
            mdfir271_dao.setInstitution_code(dto.getInstitution_code());
            mdfir271_dao.setName_of_institution(dto.getInstitution_code());
            mdfir271_dao.setAccount_number(dto.getAccount_number());
            mdfir271_dao.setAmount(dto.getAmount());
            mdfir271_dao.setRemarks(dto.getRemarks());
            mdfir271_dao.setCreated_date(LocalDate.now());
        }

        return mdfir271_repository.findById(id).map(updateMdfir271 -> {
            mdfir271_repository.save(updateMdfir271);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "id with id" + id +
            "does not exist"));
    }


    @Override
    public ServiceResponse createReport(MDFIR271_Request request) throws ResourceNotFoundException {
        MDFIR271_DAO mdfir271 = modelMapper.map(request, MDFIR271_DAO.class);
        mdfir271.setCreated_date(LocalDate.now());
        return ServiceResponse.builder().message("Report created successfully").status(HttpStatus.OK)
            .data(mdfir271_repository.save(mdfir271)).build();
    }
    }

