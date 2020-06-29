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
	@Column(name = "product_id")
	private Integer prodId;
	
	@Column(name = "product_code")
	private String prodCode;
	
	@Column(name = "product_cost")
	private Double prodCost;
	
	@Column(name = "product_vendor")
	private String prodVendor;

}
