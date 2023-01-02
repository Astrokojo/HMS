package com.hospital.management.system.hospital.management.system.service;

import com.hospital.management.system.hospital.management.system.pojo.Patient;

import java.util.List;

public interface PatientServiceInterface
{
public Patient getPatientById(Long id);
public Patient updatePatient(Long id, Patient patient);
public Patient addPatient(Patient patient);

public void deletePatient(Long id);

List<Patient> getAllPatients();
}
