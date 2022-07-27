package com.nexim.nexim.services.report;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.payload.request.SignUpRequest;
import com.nexim.nexim.services.report.MDFIR1000.MDFIR1000_Request;
import com.nexim.nexim.services.report.MDFIR1000.MDFIR1000_Services;
import com.nexim.nexim.services.report.MDFIR250.MDFIR250_DAO;
import com.nexim.nexim.services.report.MDFIR250.MDFIR250_Request;
import com.nexim.nexim.services.report.MDFIR250.MDFIR250_Services;
import com.nexim.nexim.services.report.MDFIR271.MDFIR271_Request;
import com.nexim.nexim.services.report.MDFIR271.MDFIR271_Services;
import com.nexim.nexim.services.report.MDFIR291.MDFIR291_Request;
import com.nexim.nexim.services.report.MDFIR291.MDFIR291_Services;
import com.nexim.nexim.services.report.MDFIR300.MDFIR300_DAO;
import com.nexim.nexim.services.report.MDFIR300.MDFIR300_Request;
import com.nexim.nexim.services.report.MDFIR300.MDFIR300_Services;
import com.nexim.nexim.services.report.table.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class ReportController {
    @Autowired
    private MDFIR250_Services MDFIR250_services;

    @Autowired
    private MDFIR271_Services mdfir271_services;

    @Autowired
    private MDFIR291_Services mdfir291_services;

    @Autowired
    private MDFIR300_Services mdfir300_services;

    @Autowired
    private MDFIR1000_Services mdfir1000_services;

    @Autowired
    private ReportServices reportServices;

    @Autowired
    private TableService tableSvc;

    //=====================================================================================================
    //===========================OPERATION FOR Report MDFIR250==================================================================


    //Fetch all table names
    @RequestMapping("/tables/profits")
    public ResponseEntity<?> fetchProfitsChildren(){

        return tableSvc.AssetsTableData();

    }

    //Fetch all table names
    @RequestMapping("/tables/assets")
    public ResponseEntity<?> fetchAssetsChildren(){

        return tableSvc.AssetsTableData();

    }


    @GetMapping("/listAllReportMDFIR250")
    public ResponseEntity<ServiceResponse> findAllReport() throws Exception{
        ServiceResponse response = MDFIR250_services.findAll();
        return new ResponseEntity<>(response, response.getStatus());
    }


    @PutMapping("/updateMDFIR250/{id}")
    public ResponseEntity<ServiceResponse> updateMDFIR250(@PathVariable(value = "id") long id, @Valid @RequestBody MDFIR250_Request dto) throws Exception{
        ServiceResponse response = MDFIR250_services.updateMDFIR250(id, dto);
        return new ResponseEntity<>(response, response.getStatus());
    }

    //=====================================================================================================
    //===========================OPERATIONS FOR Report MDFIR271==================================================================



    @PostMapping("/createMDFIR271")
    public ResponseEntity<ServiceResponse> createMDFIR271(@Valid @RequestBody MDFIR271_Request request) throws Exception {
        ServiceResponse response = mdfir271_services.createReport(request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/updateMDFIR271/{id}")
    public ResponseEntity<ServiceResponse> updateMDFIR271(@PathVariable(value = "id") long id, @Valid @RequestBody MDFIR271_Request request) throws Exception{
        ServiceResponse response = mdfir271_services.updateMDFIR271(id, request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/listAllMDFIR271Report")
    public ResponseEntity<ServiceResponse> ListMDFIR271Report() throws Exception{
        ServiceResponse response = mdfir271_services.findAll();
        return new ResponseEntity<>(response, response.getStatus());
    }

    //=====================================================================================================
    //===========================OPERATIONS FOR Report MDFIR291==================================================================




    @GetMapping("/listAllMDFIR291Report")
    public ResponseEntity<ServiceResponse> listMDFIR291Report() throws Exception{
        ServiceResponse response = mdfir291_services.findAll();
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/updateMDFIR291/{id}")
    public ResponseEntity<ServiceResponse> updateMDFIR291(@PathVariable(value = "id") long id, @Valid @RequestBody MDFIR291_Request request) throws Exception{
        ServiceResponse response = mdfir291_services.updateMDFIR291(id, request);
        return new ResponseEntity<>(response, response.getStatus());
    }


    //=====================================================================================================
    //===========================OPERATIONS FOR Report MDFIR300==================================================================


    @GetMapping("/mdfir300/{date}")
    public ResponseEntity<?> getAllData300(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        Boolean evt = reportServices.checkDate(date);
        if(evt) {
            return mdfir300_services.findAllMDFIR300();
        }else {
            return reportServices.NoDateFound();
        }
    }
    @PutMapping("/mdfir300/{date}/{code}")
    public ResponseEntity<?> updateMDFIR300(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,@PathVariable String code, @RequestBody MDFIR300_DAO request) throws Exception {
        Boolean evt = reportServices.checkDate(date);
        if (evt) {
            return mdfir300_services.updateMDFIR300(code, request);
        }else {
            return reportServices.NoDateFound();
        }
    }


    @GetMapping("/mmfbr300/{date}/{id}")
    public ResponseEntity<?> getDataById300(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,@PathVariable long id) throws ResourceNotFoundException {
        Boolean evt = reportServices.checkDate(date);
        if(evt== true) {
            return mdfir300_services.getDataById(id);
        }else {
            return reportServices.NoDateFound();
        }
    }

    @PostMapping("/createMDFIR300")
    public ResponseEntity<ServiceResponse> createMDFIR300(@Valid @RequestBody MDFIR300_Request request) throws Exception {
        ServiceResponse response = mdfir300_services.createMDFIR300Report(request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/listMDFIR300Report/{id}")
    public ResponseEntity<ServiceResponse> findById(@PathVariable(value = "id") long id)throws Exception{
        ServiceResponse response = mdfir300_services.findById(id);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @DeleteMapping("/deleteMDFIR300/{id}")
    public void deleteMDFIR300(@PathVariable("id") long id){
        mdfir300_services.deleteMDFIR300(id);

    }

    //=====================================================================================================
    //===========================OPERATIONS FOR Report MDFIR1000==================================================================

    @GetMapping("/listAllMDFIR1000Report")
    public ResponseEntity<ServiceResponse> listMDFIR1000Report() throws Exception{
        ServiceResponse response = mdfir1000_services.findAll();
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/updateMDFIR10000/{id}")
    public ResponseEntity<ServiceResponse> updateMDFIR1000(@PathVariable(value = "id") long id, @Valid @RequestBody MDFIR1000_Request request) throws Exception{
        ServiceResponse response = mdfir1000_services.updateMDFIR1000(id, request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping("/createMDFIR1000")
    public ResponseEntity<ServiceResponse> createMDFIR1000(@Valid @RequestBody MDFIR1000_Request request) throws Exception {
        ServiceResponse response = mdfir1000_services.createMDFIR1000Report(request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/listMDFIR1000Report/{id}")
    public ResponseEntity<ServiceResponse> find1000ById(@PathVariable(value = "id") long id)throws Exception{
        ServiceResponse response = mdfir1000_services.findById(id);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @DeleteMapping("/deleteMDFIR1000/{id}")
    public void deleteMDFIR1000(@PathVariable("id") long id){
        mdfir1000_services.deleteMDFIR1000(id);

    }


}
