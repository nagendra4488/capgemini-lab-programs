package com.capg.demo.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MovieCatelog {

	@Id 
	private int id;
	private String movieName; 
	
	@Transient
	private int port;
	public MovieCatelog() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MovieCatelog(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getmovieName() {
		return movieName;
	}
	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "MovieCatelog [id=" + id + ", movieName=" + movieName + ", port=" + port + "]";
	}
	
	
}
