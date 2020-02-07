package com.hiber.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hiber.model.*;
import com.hiber.util.JPAUtil;

public class CourseUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course btech=new Course(100,"CSE",new TreeSet<Trainee>());
		Course mtech=new Course(110,"ECE",new TreeSet<Trainee>());
		
		btech.getTrainees().add(new Trainee(200,"Rahul",btech));
		btech.getTrainees().add(new Trainee(201,"Ramya",btech));
		btech.getTrainees().add(new Trainee(202,"Raghava",btech));
		btech.getTrainees().add(new Trainee(203,"Rani",btech));
		
		mtech.getTrainees().add(new Trainee(300,"sipli",mtech));
		mtech.getTrainees().add(new Trainee(301,"Ramya",mtech));
		mtech.getTrainees().add(new Trainee(302,"Raghava",mtech));
		mtech.getTrainees().add(new Trainee(303,"Rani",mtech));

		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(btech);
		em.persist(mtech);
		txn.commit();
		System.out.println("ADDED RECORDS");
		JPAUtil.shutdown();
	}

}
