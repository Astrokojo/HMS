package com.hospital.management.system.hospital.management.system.pojo;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.id.SequenceGenerator;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Long p_id;
	private String password;
	private String first_name;
	private String last_name;
	private Date dob;
    private String gender;
    private String email;
	private String address;
	private String location;
	private String contact;

	
}
