package com.onboarding.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTACT ID")
	private long contact_id;
	@Column(name = "ADDRESS(STREET)")
	private String address;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "PINCODE")
	private String pincode;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "MOBILE#2")
	private String mobile2;
	@Column(name = "EMAILID#2")
	private String email_id;
	@Column(name = "USE ONLY CC EMAIL FOR NOTIFICATION")
	private Boolean useOnlyCcEmailForNotification;
}
