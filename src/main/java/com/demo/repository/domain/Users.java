package com.demo.repository.domain;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "identification", nullable = false,length = 80)
	private String identificationString;
	
	@Column(name = "name", nullable = false, length = 80)
	private String nameString;
	
	@Column (name = "last_name", nullable = false, length = 80)
	private String lastnameString;
	
	@Column (name = "numberphone", nullable = false,length = 80)
	private String numberPhoneString;
	
	
	
	
	
	
	

}
