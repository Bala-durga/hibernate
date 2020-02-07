package com.hiber.model1;

import javax.persistence.*;
@Entity
@Table(name="Accounts")
public class BankAccount {
	@Id
	private String accno;
	@OneToOne
	@JoinColumn(name="aadhar1")
	private Customer customer;
	public BankAccount() {
		super();
	}
	public BankAccount(String accno, Customer customer) {
		super();
		this.accno = accno;
		this.customer = customer;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
