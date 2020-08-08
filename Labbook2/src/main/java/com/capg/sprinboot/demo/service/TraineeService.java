package com.capg.sprinboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprinboot.demo.model.Trainee;
import com.capg.springboot.demo.dao.TraineeDao;

@Service
public class TraineeService {

	
	@Autowired
	TraineeDao dao;
	
	public Trainee addTrainee(Trainee t)
	{
		return dao.addTrainee(t);
	}
	
	public int deleteTrainee(int id)
	{
		return dao.deleteTrainee(id);
	}
	public Trainee find(int id) {
		return dao.findTrainee(id);
		
	}
	
}
