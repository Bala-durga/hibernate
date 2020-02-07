package com.hiber.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hiber.model.Course;
import com.hiber.util.JPAUtil;




public class JpqlEx {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		Course emp=em.find(Course.class, 100);
		if(emp!=null) {
			System.out.println(emp);
		}
		String qrystring="SELECT c from Course c";
		Query qry=em.createQuery(qrystring);
		display(qry.getResultList());
		display(em.createQuery("SELECT c from Course c where c.cid>100").getResultList());
		List<String> names=em.createQuery("SELECT c.cname From Course c").getResultList();
		
		for(String n:names) {
			System.out.println(n);
		}
		
		
		em.close();
		JPAUtil.shutdown();
	}
		static  void display(List<Course> data ) {
			System.out.println("--------------------------------------------");
			for(Course e: data) {
				System.out.println(e);
			}
			System.out.println("--------------------------------------------");
		}
	}


