package com.hiber.model1;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Address implements Serializable{
	private String dno;
	private String addressline1;
	private String addressline2;
	
	public Address() {
		super();
	}
	
	public Address(String dno, String addressline1, String addressline2) {
		super();
		this.dno = dno;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
	}

	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	
}
