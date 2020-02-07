package com.hiber.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Movies")
public class Movie implements Comparable<Movie>{
	@Id
	private int mid;
	private String mname;
	@ManyToMany(mappedBy="movies")
	private Set<Artist> artists;
	public Movie() {
		super();
	}
	public Movie(int mid, String mname, Set<Artist> artists) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.artists = artists;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Set<Artist> getArtists() {
		return artists;
	}
	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return (this.mid<m .mid ?-1:(this.mid>m.mid?1:0));
	}
	
}
