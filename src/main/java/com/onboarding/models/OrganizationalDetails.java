package com.onboarding.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrganizationalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_CODE")
	private long emp_code;
	@Column(name = "EMAIL_ID#1")
	private String email_Id1;
	@Column(name = "MOBILE#1")
	private String mobile_no1;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "COST_CODE")
	private String cost_code;
	@Column(name = "GRADE")
	private String grade;
	@Column(name = "DEPARTMENT")
	private String department;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "DATE_OF_JOINING")
	private Date date_of_joining;
	@Column(name = "DATE_OF_TERMINATION")
	private Date date_of_termination;
	@Column(name = "IS_ADMIN")
	private String is_admin;
	@Column(name = "IS_APPROVER")
	private String is_approver;
}
