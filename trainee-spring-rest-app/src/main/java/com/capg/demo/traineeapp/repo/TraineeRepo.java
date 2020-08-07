package com.capg.demo.traineeapp.repo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.capg.demo.traineeapp.model.Trainee;


@Repository
public class TraineeRepo {

Map<Integer, Trainee> trainees=new HashMap<>();
	
	
	@PostConstruct
	public void addDummyTrainees() {
		trainees.put(101,new Trainee(101,"Nagendra","DevOps","Bangalore",LocalDate.of(1998, 02, 11)));
		trainees.put(102,new Trainee(102,"Sai Rao","Java","Bangalore",LocalDate.of(1997, 04, 14)));
		trainees.put(103,new Trainee(103,"Praveen","Testing","Chennai",LocalDate.of(1999, 04, 20)));
		trainees.put(104,new Trainee(104,"Aakash","Angular","Hyderabad",LocalDate.of(1996, 03, 12)));
	}
	
	
	public Trainee addTrainee(Trainee trainee) {
		trainees.put(trainee.getTraineeId(), trainee);
		return trainee;
	}
	
	public Trainee getTrainee(int id) {
		return trainees.get(id);
	}
	
	public List<Trainee> getAllTrainee(){
		return trainees.values().stream().collect(Collectors.toList());
	}
	public void deleteTrainee(int id) {
		trainees.remove(id);
	}

	
	
}
