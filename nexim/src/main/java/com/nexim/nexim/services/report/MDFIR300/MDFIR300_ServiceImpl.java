package com.nexim.nexim.services.report.MDFIR300;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.payload.ReportResponse;
import com.nexim.nexim.payload.ServiceResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.*;

@Service
public class MDFIR300_ServiceImpl implements MDFIR300_Services {

    @Autowired
    private MDFIR300_Repository mdfir300_repository;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public ResponseEntity<?> findAllMDFIR300() {
        Iterable<MDFIR300_DAO> MDFIR300List = mdfir300_repository.findAll();
        Field[] fields = MDFIR300_DAO.class.getFields();
        ArrayList<String> colname = new ArrayList<String>();
        for (Field f : fields) {
            colname.add(f.getName());
        }
        ArrayList<String> codes = new ArrayList<String>(Arrays.asList("10110", "10120","10510", "10610", "10620", "10630",
            "10720", "10725", "10730", "10740", "10750", "10880", "10910", "10920", "10930", "10940", "10950",
            "10960", "10980", "20110", "20120", "20125", "20130", "20610", "20620", "20630", "20710", "20720",
            "20810", "20830", "20840", "20910", "20920", "20930", "20935", "20940", "20960"));

        ArrayList arrList = new ArrayList();
        try {
            for (String code : codes) {
                HashMap<String, CodeColData> MDFIR300map = new HashMap<String, CodeColData>();

                MDFIR300_DAO dataValue = mdfir300_repository.findColumnsByCode(code);
                System.out.println("codes = " + code);
                if (dataValue != null) {

                    ArrayList<String> amountList = new ArrayList<String>();
                    amountList.add("col1-" + dataValue.getAmount());
                    CodeColData _codeData = new CodeColData();
                    _codeData.setValue(amountList);
                    _codeData.setCode(code);
                    _codeData.setId(dataValue.getId());

                    arrList.add(_codeData);

                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ReportResponse res = new ReportResponse();
        res.setColumnNames(colname);
        res.setMdfir300(arrList);

        res.setResponseMessage("Success");
        res.setResponseCode(00);
        return new ResponseEntity<>(res, HttpStatus.OK);
            }

    @Override
    public ServiceResponse findById(long id) throws ResourceNotFoundException {
        return mdfir300_repository.findById(id).map(mdfir300id -> {
            ReportResponse res = new ReportResponse();
            res.setResponseMessage("Record Found");
            res.setResponseCode(00);
            return ServiceResponse.builder().message("id found").status(HttpStatus.OK).data(mdfir300id)
                .build();
        }).orElseThrow(() -> new ResourceNotFoundException("The  id " + id + "does not exist"));
    }


    @Override
    public ResponseEntity<?> updateMDFIR300(String code, MDFIR300_DAO dto) throws ResourceNotFoundException {
        Optional<MDFIR300_DAO> mdfir300_dao = mdfir300_repository.findByCode(code);
        if (mdfir300_dao.isPresent()) {
            MDFIR300_DAO updatemdfir300 = mdfir300_dao.get();
            updatemdfir300.setItem_description(dto.getItem_description());
            updatemdfir300.setAmount(dto.getAmount());
            updatemdfir300.setCreated_date(LocalDate.now());
            mdfir300_repository.save(updatemdfir300);

            ReportResponse res = new ReportResponse();
            res.setResponseMessage("Record Updated");
            res.setResponseCode(00);
            res.setMdfir300Data(updatemdfir300);
            return new ResponseEntity<>(res, HttpStatus.OK);

    } else {
        throw new ResourceNotFoundException("Record not found : " + dto.getCode());
    }
}


    @Override
    public ResponseEntity<?> getDataById(long dataId) throws ResourceNotFoundException {
        MDFIR300_DAO data = mdfir300_repository.findById(dataId)
            .orElseThrow(() -> new ResourceNotFoundException("Record not found for this id :: " + dataId));

        ReportResponse res = new ReportResponse();
        res.setResponseMessage("Record Found");
        res.setResponseCode(00);
        res.setMdfir300Data(data);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }


    @Override
    public ServiceResponse createMDFIR300Report(MDFIR300_Request request) throws ResourceNotFoundException {
        MDFIR300_DAO mdfir300 = modelMapper.map(request, MDFIR300_DAO.class);
        mdfir300.setCreated_date(LocalDate.now());
        return ServiceResponse.builder().message("Report created successfully").status(HttpStatus.OK)
            .data(mdfir300_repository.save(mdfir300)).build();

    }

    @Override
    public void deleteMDFIR300(long id) {
mdfir300_repository.deleteById(id);
    }

}

