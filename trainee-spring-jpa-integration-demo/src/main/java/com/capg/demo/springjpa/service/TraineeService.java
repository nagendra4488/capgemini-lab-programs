package com.capg.demo.springjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.demo.springjpa.errors.TraineeAlreadyExistsException;
import com.capg.demo.springjpa.errors.TraineeNotFoundException;
import com.capg.demo.springjpa.model.Trainee;
import com.capg.demo.springjpa.repo.TraineeDataJpaRepo;
import com.capg.demo.springjpa.repo.TraineeJpaRepo;

public class TraineeService {

	
	@Autowired
	TraineeJpaRepo repo;
	
	@Autowired
	TraineeDataJpaRepo dataJpaRepo;
	
	@Transactional
	public Trainee addTrainee(Trainee trainee) throws TraineeAlreadyExistsException {
		//return repo.addTrainee(trainee);
		if(dataJpaRepo.existsById(trainee.getTraineeId())){
			throw new TraineeAlreadyExistsException("Trainee Already Exists");
		}
		return dataJpaRepo.save(trainee);
	}
	
	@Transactional
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
		//return repo.getTraineeById(traineeId);

		if(!dataJpaRepo.existsById(traineeId)) {
			throw new TraineeNotFoundException("Trainee with id: "+traineeId+" Not Found");
		}
		
		return dataJpaRepo.getOne(traineeId);
	}
	
	@Transactional
	public List<Trainee> getAllTrainees(){
		// return repo.getAllTrainees();
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public void deleteTrainee(int traineeId) throws TraineeNotFoundException {
		//repo.deleteTraineeById(traineeId);
		
		if(!dataJpaRepo.existsById(traineeId)) {
			throw new TraineeNotFoundException("Trainee with id: "+traineeId+" Not Found");
		}
		
		
		dataJpaRepo.deleteById(traineeId);
	}
	
	public Trainee updateTrainee(Trainee trainee) throws TraineeNotFoundException {
		Trainee tr=dataJpaRepo.getOne(trainee.getTraineeId());
		
		if(tr==null) {
			throw new TraineeNotFoundException("Trainee with id: "+trainee.getTraineeId()+" Not Found");
		}
		
		tr.setTraineeDomain(trainee.getTraineeDomain());
		tr.setTraineeLocation(trainee.getTraineeLocation());
		tr.setTraineeName(trainee.getTraineeName());
		return dataJpaRepo.save(tr);
		
	}
	
	
	public Trainee findTraineeByName(String traineeName) throws TraineeNotFoundException {
		Trainee tr= dataJpaRepo.findByTraineeName(traineeName);
		if(tr==null) {
			throw new TraineeNotFoundException("Trainee with name: "+traineeName+" Not Found");
		}
		return tr;
	}
	
	public Trainee findTraineeByNameAndDomain(String traineeName, String traineeDomain) throws TraineeNotFoundException {
		Trainee tr= dataJpaRepo.findByTraineeNameAndTraineeDomain(traineeName, traineeDomain);
		if(tr==null) {
			throw new TraineeNotFoundException("Trainee with name: "+traineeName+" and domain: "+traineeDomain+" Not Found");
		}
		return tr;
	}
	
	
	
}
