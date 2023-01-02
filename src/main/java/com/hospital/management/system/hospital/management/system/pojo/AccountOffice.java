package com.hospital.management.system.hospital.management.system.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountOffice 
{
	@Id
	@GeneratedValue
	private Long p_id;
    private Long bill_id;
	private Long amount;
	private Long quanity;
	private Long drug_id;
	private Long doc_id;

}
