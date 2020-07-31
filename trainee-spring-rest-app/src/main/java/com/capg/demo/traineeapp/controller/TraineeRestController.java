package com.capg.demo.traineeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.traineeapp.model.Trainee;
import com.capg.demo.traineeapp.service.TraineeService;

@RestController
public class TraineeRestController {

	
	@Autowired
	TraineeService service;
	
	@GetMapping("/trainee")
//	@ResponseBody
	public Trainee getTrainee() {
		return new Trainee(101,"Mahesh","DevOps","Bangalore");
	}
	
	@PostMapping("/trainee")
	public Trainee addTrainee(@RequestBody Trainee t1) {
		
		return t1;
		
	}
	
	@GetMapping("/trainee/id/{id}")
	public Trainee findTrainee(@PathVariable("id") int tId) {
	System.out.println(tId);
	return null;
	}
	
	@DeleteMapping("/trainee/id/{id}")
	public void deleteTrainee(@PathVariable int id) {
		service.removeTrainee(id);
	}
	
	
	
}
