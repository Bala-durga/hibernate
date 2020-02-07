package com.hiber.model1;
import javax.persistence.*;

@Entity
@Table(name="faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int factyid;
	String factyname;
	
	@Embedded
	private Address address;

	public Faculty() {
		super();
	}

	public Faculty( String factyname, Address address) {
		super();
		this.factyname = factyname;
		this.address = address;
	}

	
	public String getFactyname() {
		return factyname;
	}

	public void setFactyname(String factyname) {
		this.factyname = factyname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}