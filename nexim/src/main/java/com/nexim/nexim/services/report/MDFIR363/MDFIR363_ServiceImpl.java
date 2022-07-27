package com.nexim.nexim.services.report.MDFIR363;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.services.report.MDFIR271.MDFIR271_DAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class MDFIR363_ServiceImpl implements MDFIR363_Services{
@Autowired
private MDFIR363_Repository mdfir363_repository;

@Autowired
private ModelMapper modelMapper;

    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<MDFIR363_DAO> MDFIR363List = mdfir363_repository.findAll();
        String message = !MDFIR363List.isEmpty() ? "Record found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR363List).build();
    }

    @Override
    public ServiceResponse updateMDFIR363(Long id, MDFIR363_Request dto) throws ResourceNotFoundException {
        MDFIR363_DAO mdfir363_dao = mdfir363_repository.findById(id).get();
        if (mdfir363_repository.findById(id).isPresent()) {
            mdfir363_dao.setType_of_investment(dto.getType_of_investment());
            mdfir363_dao.setPercentage_1(dto.getPercentage_1());
            mdfir363_dao.setQuoted_1(dto.getQuoted_1());
            mdfir363_dao.setUnquoted_1(dto.getUnquoted_1());
            mdfir363_dao.setPercentage_2(dto.getPercentage_2());
            mdfir363_dao.setQuoted_2(dto.getQuoted_2());
            mdfir363_dao.setUnquoted_2(dto.getUnquoted_2());
            mdfir363_dao.setQuoted_3(dto.getQuoted_3());
            mdfir363_dao.setUnquoted_3(dto.getUnquoted_3());
            mdfir363_dao.setImpairment(dto.getImpairment());
            mdfir363_dao.setNet_amount(dto.getNet_amount());
            mdfir363_dao.setCreated_date(LocalDate.now());
        }
        return mdfir363_repository.findById(id).map(updateMdfir363 -> {
            mdfir363_repository.save(updateMdfir363);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "id with id" + id +
            "does not exist"));
    }
    @Override
    public ServiceResponse createMDFIR363Report(MDFIR363_Request request) throws ResourceNotFoundException {
        MDFIR363_DAO mdfir363 = modelMapper.map(request, MDFIR363_DAO.class);
        mdfir363.setCreated_date(LocalDate.now());
        return ServiceResponse.builder().message("Report created successfully").status(HttpStatus.OK)
            .data(mdfir363_repository.save(mdfir363)).build();
    }

    @Override
    public ServiceResponse findById(Long id) throws ResourceNotFoundException {
        return mdfir363_repository.findById(id).map(uid -> {
            return ServiceResponse.builder().message("id found").status(HttpStatus.OK).data(uid)
                .build();
        }).orElseThrow(() -> new ResourceNotFoundException("The  id " + id + "does not exist"));
    }
    @Override
    public void deleteMDFIR363(Long id){
        mdfir363_repository.deleteById(id);
    }


//    @Override
//    public ResponseEntity<?> deleteMDFIR363(Long id) throws ResourceNotFoundException {
//        MDFIR363_DAO mdfir363_dao = mdfir363_repository.findById(id).get();
//        if (mdfir363_repository.findById(id).isPresent()) {
//            mdfir363_repository.deleteMDFIR363(id).get();
//        } else {
//            throw new ResourceNotFoundException("Record not found with id : " + id);
//        }
//
//        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR363List).build();
//
//    }


}
