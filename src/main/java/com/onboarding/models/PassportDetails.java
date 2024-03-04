package com.onboarding.models;

import java.io.File;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PassportDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PASSPORT DETAILS ID")
	private long passport_detail_id;
	@Column(name="FIRST NAME")
	private String first_name;
	@Column(name="MIDDLE NAME")
	private String middle_name;
	@Column(name="LAST NAME")
	private String last_name;
	@Column(name="PASSPORT NUMBER")
	private String passport_no;
	@Column(name="COUNTRY OF ISSUE")
	private String country_of_issue;
	@Column(name="DATE OF BIRTH")
	private Date date_of_birth;
	@Column(name="DATE OF ISSUE")
	private Date date_of_issue;
	@Column(name="DATE OF EXPIRE")
	private Date date_of_expire;
	@Column(name="PLACE OF ISSUE")
	private String place_of_issue;
	@Column(name="SCAN COPY(OCR)")
	private File scan_copy;
	
}
