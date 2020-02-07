package com.hiber.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="TabStudents")
public class Student {
	
	@EmbeddedId
	private StudentIdentity sid;
	@Column(name="fnm",nullable=false)
	private String firstName;
	@Column(name="lnm")
	private String lastname;
	@Column(name="dob",nullable=false)
	private Date dateOFBirth;
	public Student() {
		super();
	}
	public Student(StudentIdentity sid, String firstName, String lastname, Date dateOFBirth) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateOFBirth = dateOFBirth;
	}
	public StudentIdentity getSid() {
		return sid;
	}
	public void setSid(StudentIdentity sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateOFBirth() {
		return dateOFBirth;
	}
	public void setDateOFBirth(Date dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}
	
	
	
}
