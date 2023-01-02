package com.hospital.management.system.hospital.management.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.management.system.hospital.management.system.pojo.Patient;

import java.util.Optional;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> 
{

    Optional<Patient> findByEmail(String email);
}
