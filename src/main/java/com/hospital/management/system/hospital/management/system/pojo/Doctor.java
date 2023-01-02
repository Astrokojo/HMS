package com.hospital.management.system.hospital.management.system.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor 
{
	@Id
	@GeneratedValue
	private Long p_id;
	private Long doc_id;
	private String password;
	private String first_name;
	private String last_name;
	private String hospital_name;
	private String contact;
	private String email;
	

}
