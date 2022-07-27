package com.nexim.nexim.services.report.MDFIR1000;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.services.report.MDFIR300.MDFIR300_DAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MDFIR1000_ServiceImpl implements MDFIR1000_Services{

    @Autowired MDFIR1000_Repositoy mdfir1000_repositoy;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public ServiceResponse createMDFIR1000Report(MDFIR1000_Request request) throws ResourceNotFoundException {
        MDFIR1000_DAO mdfir1000 = modelMapper.map(request, MDFIR1000_DAO.class);
        mdfir1000.setCreated_date(LocalDate.now());
        return ServiceResponse.builder().message("Report created successfully").status(HttpStatus.OK)
            .data(mdfir1000_repositoy.save(mdfir1000)).build();

    }


    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<MDFIR1000_DAO> MDFIR1000List = mdfir1000_repositoy.findAll();
        String message = !MDFIR1000List.isEmpty() ? "Record found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(MDFIR1000List).build();
    }

    @Override
    public ServiceResponse updateMDFIR1000(long id, MDFIR1000_Request dto) throws ResourceNotFoundException {
        MDFIR1000_DAO mdfir1000_dao = mdfir1000_repositoy.findById(id).get();
        if (mdfir1000_repositoy.findById(id).isPresent()) {
            mdfir1000_dao.setItem_description(dto.getItem_description());
            mdfir1000_dao.setCurrent_month(dto.getCurrent_month());
            mdfir1000_dao.setYear_to_date(dto.getYear_to_date());
            mdfir1000_dao.setCreated_date(LocalDate.now());
        }
        return mdfir1000_repositoy.findById(id).map(updateMDFIR1000 -> {
            mdfir1000_repositoy.save(updateMDFIR1000);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, " id with id " + id + " does not exist"));
    }

    @Override
    public ServiceResponse findById(long id) throws ResourceNotFoundException {
        return mdfir1000_repositoy.findById(id).map(mdfir1000Id -> {
            return ServiceResponse.builder().message("id found").status(HttpStatus.OK).data(mdfir1000Id)
                .build();
        }).orElseThrow(() -> new ResourceNotFoundException("The  id " + id + "does not exist"));
    }

    @Override
    public void deleteMDFIR1000(long id) {
        mdfir1000_repositoy.deleteById(id);
    }
}
