package com.capg;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int stuId;
	String stuName;
	String stuDob;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuDob() {
		return stuDob;
	}
	public void setStuDob(String stuDob) {
		this.stuDob = stuDob;
	}
	public Student(int stuId, String stuName, String stuDob) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuDob = stuDob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}
