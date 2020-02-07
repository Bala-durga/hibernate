package com.hiber.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hiber.model.*;
import com.hiber.util.JPAUtil;

public class MovieUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist a1=new Artist(101,"AlluArjun",new TreeSet<Movie>());
		Artist a2=new Artist(111,"Rakul",new TreeSet<Movie>());
		Artist a3=new Artist(222,"Hrithikroshan",new TreeSet<Movie>());
		
		Movie m1=new Movie(101,"Vaikuntapuram",new TreeSet<Artist>());
		Movie m2=new Movie(222,"dhoom",new TreeSet<Artist>());
		Movie m3=new Movie(111,"brucelee",new TreeSet<Artist>());
		
		m1.getArtists().add(a1);
		m2.getArtists().add(a2);
		m3.getArtists().add(a3);
		
		m2.getArtists().add(a3);
		m2.getArtists().add(a1);
		
		a1.getMovies().add(m1);
		a3.getMovies().add(m2);
		a2.getMovies().add(m3);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		txn.commit();
		JPAUtil.shutdown();
		

		
	}

}
