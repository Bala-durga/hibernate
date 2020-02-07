package com.hiber.model1;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("Memp")
@Table(name="Memps1")
public class Manager extends Emp {
	@Column(name="allowance")
	private double allowance;

	public Manager(long eid, String ename, double basic,double allowance) {
		super(eid,ename,basic);
		this.allowance = allowance;
	}

	public Manager() {
		super();
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
}
