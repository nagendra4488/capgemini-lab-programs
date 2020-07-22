package com.capg.demos;

import java.util.Scanner;

import com.capg.demos.model.Trainee;
import com.capg.demos.service.TraineeServiceImpl;

/**
 * Hello world!
 *
 */
public class User 
{
    public static void main( String[] args )
    {
    	Scanner scan= new Scanner(System.in);
    	  TraineeService servobj = new TraineeServiceImpl();
        System.out.println( "Hello World!" );
        System.out.println("1.Add Trainee");
        System.out.println("2.Delete Trainee");
        System.out.println("3.Search Trainee");
        System.out.println("Enter Choice : ");
        int n= scan.nextInt();
        
      
     Trainee traineeobj = new Trainee();
        switch(n) {
        
        case 1:
        	System.out.println("Add Trainee");
        	
        	System.out.println("Enter trainee ID");
			int tId=scan.nextInt();
			System.out.println("Enter trainee Name");
			String tName=scan.next();
			System.out.println("Enter trainee dept");
			String dept=scan.next();
			Trainee traineeObj=new Trainee(tId, tName, dept);
			Trainee obj=servobj.addTrainee(traineeObj);
			if(obj==null)
			{
				System.out.println("trainee added successfully");
			}
			else
				System.out.println("trainee not added");
				
				break;
         
        break;
        case 2:
        	System.out.println("Delete Trainee");
        	int id=scan.nextInt();
			boolean flag=servobj.removeTrainee(id);
			if(flag==true)
			{
				System.out.println("trainee deleted");
			}
			else
			{
				System.out.println("trainee not found");
			}
			break;
			
        	
        	
        
        break;
        case 3:
        	System.out.println("Search Trainee");
        	
        	int traineeId=scan.nextInt();
			Trainee trainee=servobj.findTrainee(traineeId);
			if(trainee==null)
			{
				System.out.println("Trainee not found");
			}
			else
				System.out.println("Trainee found - "+trainee);
			break;

        
        break;

        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }     
    

	   
}
