package com.hospital.management.system.hospital.management.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.system.hospital.management.system.pojo.AccountOffice;

@Repository
public interface AccountOfficeDao extends JpaRepository<AccountOffice, Long> 
{

}
