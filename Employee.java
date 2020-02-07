+package com.hiber.model;

import javax.persistence.*;

@Entity
@Table(name="TestEmps")
public class Employee {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename",nullable=false)
	private String empName;
	private double basic;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basic = basic;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
}
