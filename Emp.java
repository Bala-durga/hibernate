package com.hiber.model1;

import javax.persistence.*;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="Emps")
//@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("emp")
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="Emps2")
public class Emp {
	@Id
	@Column(name="eid")
	private long eid;
	@Column(name="ename")
	private String ename;
	@Column(name="ebasic")
	private double basic;
	public Emp() {
		super();
	}
	public Emp(long eid, String ename, double basic) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	

}
