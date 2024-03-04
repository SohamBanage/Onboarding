package com.onboarding.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private long user_id;
	@Column(name = "SALUTATION")
	private String salutation;
	@Column(name = "FIRST_NAME")
	private String first_name;
	@Column(name = "MIDDLE_NAME")
	private String middle_name;
	@Column(name = "LAST_NAME")
	private String last_name;
	@Column(name = "STATUS")
	private String status;

}
