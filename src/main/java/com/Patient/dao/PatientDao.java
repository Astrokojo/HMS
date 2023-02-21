package com.Patient.dao;

import com.Patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {

    Optional<Patient> findByEmail(String email);
}
