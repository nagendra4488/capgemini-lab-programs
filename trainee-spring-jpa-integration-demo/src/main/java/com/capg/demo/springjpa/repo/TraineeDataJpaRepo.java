package com.capg.demo.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.demo.springjpa.model.Trainee;

public interface TraineeDataJpaRepo extends JpaRepository<Trainee, Integer> {

	
	@Query("from Trainee where traineeName=:traineeName")
	public Trainee findByTraineeName(String traineeName);
	public Trainee findByTraineeNameAndTraineeDomain(String traineeName,String traineeDomain);
}

