package com.capg.demos.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.demos.model.Trainee;

public class TraineeDaoCollectionsBasedImpl implements TraineeDao {

	
	Map<Integer,Trainee> listOfTrainees=new HashMap<Integer,Trainee>();
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		
		Trainee tlist=listOfTrainees.put(trainee.getId(), trainee);
	//	System.out.println(listOfTrainees);
		return tlist;
		
	}

	@Override
	public Trainee findTrainee(int id) {
		
		Trainee tlist = null;
		for (Map.Entry<Integer, Trainee> mapper:listOfTrainees.entrySet()) {
			
			
			if(mapper.getKey().equals(id))
			{
				tlist=mapper.getValue();
			}
		
		}
		return tlist;
		
	}

	@Override
	public boolean removeTrainee(int id) {
		boolean flag = false;
		Trainee delete =listOfTrainees.remove(id);

		
		if (delete != null) {
			flag = true;
		}

		return flag;
		
	}

}
