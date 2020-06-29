package com.kundan.model;

public class Brand {
	
	private String code;
	private String regNum;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	@Override
	public String toString() {
		return "Brand [code=" + code + ", regNum=" + regNum + "]";
	}
	
	
}
