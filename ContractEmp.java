package com.hiber.model1;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("cemp")
@Table(name="Cemps1")
public class ContractEmp extends Emp{
	@Column(name="duration")
	private int duration;

	public ContractEmp() {
		super();
	}

	public ContractEmp(long eid, String ename, double basic,int duration) {
		super(eid,ename,basic);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
