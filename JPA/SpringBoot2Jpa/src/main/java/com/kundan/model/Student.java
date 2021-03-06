package com.kundan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "std_id")
	private Integer stdId;
	
	@Column(name = "std_name")
	private String stdName;
	
	@Column(name = "std_fee")
	private Double stdFee;

}
