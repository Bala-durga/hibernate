package com.hiber.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hiber.model1.BankAccount;
import com.hiber.model1.Customer;
import com.hiber.util.JPAUtil;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		Customer c=new Customer("719859986858","nikhilaDamaraju",ba);
		ba.setAccno("526987AN");
		ba.setCustomer(c);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(c);
		txn.commit();
		JPAUtil.shutdown();
	}

}
