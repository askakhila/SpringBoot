package com.hbsols.model;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "S_DTLS")
@Data
public class StudentEntity {

	@Id
	@GeneratedValue
	@Column(name="ST_ID", length = 4)
	private Integer stId;
	
	@Column(name="name", length = 25)
	private String name;

	@Column(name="email", length = 25)
	private String email;

	@Column(name="phoneNum", length = 15)
	private Long phoneNum;

   @Column(name="gender", length= 4)
	private String gender;

	@Column(name="course", length = 15)
	private String course;

	
	  @Column(name="timing") 
	  private String[] timing;
	 
	

	@OrderColumn
	@ElementCollection
	@CollectionTable(name="st_course_timings", joinColumns = @JoinColumn(name =  "ST_ID"))
	private String[] timings;
	

}
