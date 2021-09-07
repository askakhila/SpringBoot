package com.hbsols.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "GENDER_DTLS")
public class Genders {

	@Id
	@Column(name = "GENDER_ID")
	private Integer genderId;

	@Column(name = "GENDER_NM")
	private String genderName;

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

}
