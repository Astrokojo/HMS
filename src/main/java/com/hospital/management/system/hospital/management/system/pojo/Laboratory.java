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
public class Laboratory 
{
	@Id
	@GeneratedValue
	private Long lab_no;
	private Long doc_id;
	private Long p_id;
	private String date;
	private double quoted_price;

}
