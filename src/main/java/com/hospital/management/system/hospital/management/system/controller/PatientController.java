package com.hospital.management.system.hospital.management.system.controller;

import com.hospital.management.system.hospital.management.system.dao.PatientDao;
import com.hospital.management.system.hospital.management.system.pojo.Patient;
import com.hospital.management.system.hospital.management.system.service.implementation.PatientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {
    @Autowired
    private PatientDao patientDao;

    @Autowired
    private PatientServiceImp service;

    @PostMapping("addpatient")
    public void addPatient(@RequestBody Patient patient){
         service.addPatient(patient);
    }

    @PutMapping("/update/{id}")
    public Patient updatePatient(@PathVariable("id") Long id, @RequestBody Patient patient){
       return service.updatePatient(id, patient);
    }

    @GetMapping("allpatients")
    public List<Patient> getAllPatients(){
        return service.getAllPatients();
    }

    @DeleteMapping("{patientId}")
    public void deletePatient(@PathVariable("patientId") Long patientId){
        service.deletePatient(patientId);
    }

}

