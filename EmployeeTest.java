package com.hiber.ui;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.hiber.model.Employee;
import com.hiber.util.*;
public class EmployeeTest {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Employee em=new Employee();
		System.out.println("EmpId:");
		em.setEmpId(sc.nextInt());
		System.out.println("EmpName:");
		em.setEmpName(sc.next());
		System.out.println("EmpBasic:");
		em.setBasic(sc.nextDouble());
		
		EntityManager emp=JPAUtil.getEntityManagerFactory().createEntityManager();
		emp.getTransaction().begin();
		emp.persist(em);
		emp.getTransaction().commit();
		System.out.println("Emp saved:");
		JPAUtil.shutdown();
		sc.close();
		
	}

}
