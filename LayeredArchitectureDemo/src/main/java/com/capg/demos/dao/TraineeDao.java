package com.capg.demos.dao;

import com.capg.demos.model.Trainee;

public interface TraineeDao {

	public Trainee addTrainee(Trainee trainee);
	public Trainee findTrainee(int id);
	public boolean removeTrainee(int id);
}
