package com.capg.springboot.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.sprinboot.demo.model.Trainee;

@Repository
public class TraineeDao {

	Map<Integer, Trainee> traineeList =new HashMap<Integer, Trainee>();
	
	public Trainee addTrainee(Trainee t)
	{
		traineeList.put(t.getId(), t);
		return t;
	}
	
	public int  deleteTrainee(int id)
	{ 
				traineeList.remove(id);
				return id;
	}
	
	public Trainee findTrainee(int tid) {

		if(traineeList.containsKey(tid))
		{
			return traineeList.get(tid);
	
		}
		else
		{
			return null;
		}

	}
	
	
}
