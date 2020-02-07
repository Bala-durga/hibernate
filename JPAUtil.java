package com.hiber.util;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final String PERSISTANCE_UNIT_NAME="JHPU";
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getEntityManagerFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		}
		return factory;
	}
	public static void shutdown() {
		if(factory!=null) {
			factory.close();
		}
	}
}
