package com.Patient.service;

import com.Patient.model.Patient;

import java.util.List;

public interface PatientServiceInterface {
    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    Patient addPatient(Patient patient);

    Patient updatePatient(Long id, Patient patient);

    void deletePatient(Long id);

}
