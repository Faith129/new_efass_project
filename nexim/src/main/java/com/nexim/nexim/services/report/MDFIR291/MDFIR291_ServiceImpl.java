package com.nexim.nexim.services.report.MDFIR291;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class MDFIR291_ServiceImpl implements MDFIR291_Services {
    @Autowired
    private MDFIR291_Repository mdfir291_repository;

    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<MDFIR291_DAO> MDFIR291List = mdfir291_repository.findAll();
        String message = !MDFIR291List.isEmpty() ? "Record found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR291List).build();

    }

    @Override
    public ServiceResponse updateMDFIR291(long id, MDFIR291_Request dto) throws ResourceNotFoundException {
        MDFIR291_DAO mdfir291_dao = mdfir291_repository.findById(id).get();
        if (mdfir291_repository.findById(id).isPresent()) {
            mdfir291_dao.setInstitution_code(dto.getInstitution_code());
            mdfir291_dao.setName_of_bank(dto.getName_of_bank());
            mdfir291_dao.setType_of_placements(dto.getType_of_placements());
            mdfir291_dao.setAccount_number(dto.getAccount_number());
            mdfir291_dao.setAmount_1(dto.getAmount_1());
            mdfir291_dao.setAmount_2(dto.getAmount_2());
            mdfir291_dao.setTenor(dto.getTenor());
            mdfir291_dao.setEffective_date(dto.getEffective_date());
            mdfir291_dao.setMaturity_date(dto.getEffective_date());
            mdfir291_dao.setInterest_rate(dto.getInterest_rate());
            mdfir291_dao.setUpfront_interest_received(dto.getUpfront_interest_received());
            mdfir291_dao.setTimes_rolled_over(dto.getTimes_rolled_over());
            mdfir291_dao.setCreated_date(LocalDate.now());
        }



        return mdfir291_repository.findById(id).map(updateMdfir291 -> {
            mdfir291_repository.save(updateMdfir291);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "id with id" + id +
            "does not exist"));
    }
}
