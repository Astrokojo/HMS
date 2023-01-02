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
public class Pharmacy 
{
	@Id
	@GeneratedValue
	private Long p_id;
    private Long store_id;
    private String password;
	private String store_name;
    private String location;
	private String city;
	private String country;

}
