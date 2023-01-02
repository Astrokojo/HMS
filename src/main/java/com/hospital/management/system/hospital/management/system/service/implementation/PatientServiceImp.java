package com.hospital.management.system.hospital.management.system.service.implementation;

import com.hospital.management.system.hospital.management.system.dao.PatientDao;
import com.hospital.management.system.hospital.management.system.pojo.Patient;
import com.hospital.management.system.hospital.management.system.service.PatientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientServiceImp implements PatientServiceInterface {

    @Autowired
    private PatientDao patientDao;


    @Override
    public Patient addPatient(Patient patient){
     //  Optional<Patient> patientEmail = patientDao.findByEmail(patient.getEmail());
     //   if (patientEmail.isPresent()){
     //       throw new IllegalStateException("email already exists");
     //   }
       return patientDao.save(patient);
    }

    @Override
    @Transactional
    public Patient updatePatient(Long id, Patient patient){
        return patientDao.findById(id)
                .map(newPatient->{
                    patient.setFirst_name(patient.getFirst_name());
                    patient.setLast_name(patient.getLast_name());
                    patient.setDob(patient.getDob());
                    patient.setGender(patient.getGender());
                    patient.setEmail(patient.getEmail());
                    patient.setContact(patient.getContact());
                    patient.setAddress(patient.getAddress());
                    patient.setLocation(patient.getLocation());
                    return patientDao.save(newPatient);
                })
                .orElseGet(()->{return patientDao.save(patient);});
    }

    @Override
    public List<Patient> getAllPatients(){
        return patientDao.findAll();
    }

    @Override
    public Patient getPatientById(Long id){
        return patientDao.findById(id).orElse(null );
    }

    @Override
    public void deletePatient(Long patientId){
        boolean exists = patientDao.existsById(patientId);
        if (!exists){
            throw new IllegalStateException("patient with id" + patientId + "does not exist");
        }
        patientDao.deleteById(patientId);
    }
}
