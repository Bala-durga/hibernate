package com.hiber.ui;

import java.util.Date;

import javax.persistence.EntityManager;

import com.hiber.model.Student;
import com.hiber.model.StudentIdentity;
import com.hiber.util.*;

public class EFCompositePK {
	public static void main(String[] args) {
		Student s=new Student(new StudentIdentity(2,'B',8),"sindhu","kalyani",new Date(1997,15,4));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Student Saved");
		JPAUtil.shutdown();
		
	}

}
