package com.hospital.management.system.hospital.management.system.controller;

import com.hospital.management.system.hospital.management.system.dao.PatientDao;
import com.hospital.management.system.hospital.management.system.pojo.Patient;
import com.hospital.management.system.hospital.management.system.service.implementation.PatientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class PatientController {
    @Autowired
    private PatientDao patientDao;

    @Autowired
    private PatientServiceImp service;

    @PutMapping("update/{id}")
    public void updatePatient(@PathVariable("id") Long id, @RequestBody Patient patient){
        service.updatePatient(id, patient);

    }
    @PostMapping("addpatient")
    public void addPatient(@RequestBody Patient patient){
         service.addPatient(patient);
    }


    @GetMapping("allpatients")
    public List<Patient> getAllPatients(){
        return service.getAllPatients();
    }

    @GetMapping("/findpatient/{id}")
    public Patient getPatientById(@PathVariable("id") Long id){
        return service.getPatientById(id);
    }

    @DeleteMapping("delete/{patientId}")
    public void deletePatient(@PathVariable("patientId") Long patientId){
        service.deletePatient(patientId);
    }

}

