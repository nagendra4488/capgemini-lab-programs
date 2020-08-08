package com.capg.sprinboot.demo.model;

public class Trainee {

	int id;
	String name;
	String domain;
	String Location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", domain=" + domain + ", Location=" + Location + "]";
	}
	
	
	
	
	
	
	
}
