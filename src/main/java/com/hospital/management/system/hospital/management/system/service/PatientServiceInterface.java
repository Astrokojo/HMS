package com.hospital.management.system.hospital.management.system.service;

import com.hospital.management.system.hospital.management.system.pojo.Patient;

import java.util.List;

public interface PatientServiceInterface
{
     List<Patient> getAllPatients();
     Patient getPatientById(Long id);
     Patient addPatient(Patient patient);
     Patient updatePatient(Long id, Patient patient);
     void deletePatient(Long id);

}
