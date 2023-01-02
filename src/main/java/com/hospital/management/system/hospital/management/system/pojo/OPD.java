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
public class OPD 
{
	@Id
	@GeneratedValue
	private Long p_id;
    private Long hospital_id;
    private String password;
	private String hos_name;
	private String city;
	private String country;
	private String email;
	private String contact;


}
