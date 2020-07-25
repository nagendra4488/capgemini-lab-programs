package com.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRecord {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(11,"Nag","11-02-1998");
		Student s2 = new Student(12,"Nagababu","11-04-1998");
		Student s3 = new Student(13,"Bharath","11-01-1998");
		
		
			
    
    	

    
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
    	EntityManager em =emf.createEntityManager();
    	
    
    	
    	EntityTransaction et=em.getTransaction();
    	et.begin();
    	Student a3=em.find(Student.class, 11);
    	//em.persist(s1;
    	//em.persist(s2);
    	//em.persist(s3);
    	
    	em.remove(s3);
    	et.commit();
    	
    	//System.out.println(s1);
    	//System.out.println(s2);
    	
    	System.out.println(s3);
    	
    
    	

    
    	
    			
		
	}
	
	
}
