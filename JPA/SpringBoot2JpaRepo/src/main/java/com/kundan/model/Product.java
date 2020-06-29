package com.kundan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "prod_id")
	private Integer prodId;
	
	@Column(name = "prod_code")
	private String prodCode;
	
	@Column(name = "prod_cost")
	private Double prodCost;
	
	@Column(name = "prod_vendor")
	private String prodVender;
	
	@Column(name = "prod_desc")
	private String prodDesc;
}
