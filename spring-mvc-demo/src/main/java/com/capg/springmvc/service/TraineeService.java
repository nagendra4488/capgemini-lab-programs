package com.capg.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springmvc.dao.TraineeDao;
import com.capg.springmvc.model.Trainee;

@Service
public class TraineeService {

	@Autowired
	TraineeDao dao;
	
	public Trainee addTrainee(Trainee t1) {
		return dao.addTrainee(t1);
	}
	
	public Trainee getTrainee(int tId) {
		return dao.fetchTrainee(tId);
	}
	
	
}
