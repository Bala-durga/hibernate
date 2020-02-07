package com.hiber.ui;

import javax.persistence.EntityManager;

import com.hiber.model1.*;
import com.hiber.util.JPAUtil;

public class EmpUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp(121,"nikki",25000);
		ContractEmp cm=new ContractEmp(122,"helen",50000,10000);
		Manager m=new Manager(133,"peter",23000,12);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(cm);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("Saved Records");
		JPAUtil.shutdown();
		

	}

}
