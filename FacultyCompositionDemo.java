package com.hiber.ui;

import javax.persistence.EntityManager;

import com.hiber.model1.Address;
import com.hiber.model1.Faculty;
import com.hiber.util.JPAUtil;

public class FacultyCompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty f=new Faculty("Sasirekha",
				new Address("N143","GVP PG,Brookfield,Kundanahalli","Banglore,Karnataka"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		System.out.println("Faculty saved");
		JPAUtil.shutdown();
		

	}

}
