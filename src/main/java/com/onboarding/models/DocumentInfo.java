package com.onboarding.models;

import jakarta.persistence.Column;

public class DocumentInfo {

	@Column(name="DOCUMENT INFO ID")
	private long doc_info_id;
	
	
	private PassportDetails passportDetails;
}
