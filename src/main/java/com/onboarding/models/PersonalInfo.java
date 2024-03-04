package com.onboarding.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PersonalInfo {

	@Column(name = "PERSONAL INFO ID")
	private long persional_info_id;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "RESIDENCY")
	private String residency;
	@Column(name = "DATE OF BIRTH")
	private Date date_of_birth;
	@Column(name = "TRAVEL COORDINATOR")
	private String travel_coordinator;
	@Column(name = "EXECUTIVE ASSISTANT")
	private String executive_assistant;
	@Column(name = "DELEGATING SUPERVISOR")
	private String delegating_supervisor;
	@Column(name = "PROFILE  TYPE")
	private String profile_type;
	
}
