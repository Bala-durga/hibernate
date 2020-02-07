package com.hiber.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Artists")
public class Artist implements Comparable<Artist>{
	@Id
	private int aid;
	private String aname;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="MovieArtists",joinColumns= {@JoinColumn(name="aid")},
	inverseJoinColumns= {@JoinColumn(name="mid")})
	private Set<Movie> movies;
	public Artist() {
		super();
	}
	public Artist(int aid, String aname, Set<Movie> movies) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.movies = movies;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	public int compareTo(Artist a) {
		// TODO Auto-generated method stub
		return this.aid<a.aid?-1:(this.aid>a.aid?1:0);
	}
	

}
