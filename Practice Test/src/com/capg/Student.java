package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	String name;
	int age;
	int height;
	public Student(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
}
	
	    
	    class Sortbyage implements Comparator<Student> 
		{ 
		    public int compare(Student a, Student b) 
		    { 
		        return a.age - b.age; 
		    } 
		} 
		
		class Sortbyname implements Comparator<Student> 
		{ 
		    public int compare(Student a, Student b) 
		    { 
		        return a.name.compareTo(b.name); 
		    } 
		} 
		
		class Sortbyheight implements Comparator<Student> 
		{ 
		    public int compare(Student a, Student b) 
		    { 
		        return a.height - b.height; 
		    } 
		} 
		
		class Result {
			
		    public static void main (String[] args) 
		    { 
		        List<Student> stulist = new ArrayList<Student>(); 
		        stulist.add(new Student("Nag", 26, 165)); 
		        stulist.add(new Student("SaiRao", 22, 167)); 
		        stulist.add(new Student("Mahesh Babu", 27, 170)); 
		  
		        System.out.println("Unsorted"); 
		        for (int i=0; i<stulist.size(); i++) 
		        {
		            System.out.println(stulist.get(i)); 
		  
		        }
		        
					        
		       
		 //       Collections.sort(stulist,(t1,t2)->t1.name.compareTo(t2.name));
		        
		      Collections.sort(stulist,(t1,t2)->t1.age - t2.age);

		 //       Collections.sort(stulist,(t1,t2)->t1.height - t2.height);

		        System.out.println("Students List :");
		        
		        
		        for (int i=0; i<stulist.size(); i++)
		        {
		        	
					  System.out.println(stulist.get(i)); 
					  
					  }
		        
		        
		    } 	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


