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
public class Employee 
{
	@Id
	@GeneratedValue
	private Long p_id;
	private Long e_id;
	private String password;
    private String first_name;
	private String last_name;
    private String gender;
    private String email;
	private String contact;
	private Long salary;

}
