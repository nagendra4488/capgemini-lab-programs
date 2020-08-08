package com.capg.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.sprinboot.demo.model.Trainee;
import com.capg.sprinboot.demo.service.TraineeService;

@Controller
public class TraineeController {

	/*
	 * @PostMapping("/add") public String getTraineeName(@RequestParam("txtName")
	 * String tName, Model m) { m.addAttribute("tname", tName); return "show"; }
	 * 
	 * @GetMapping public String showAddTraineePage() { return "add-trainee"; }
	 */
	
	@Autowired
	TraineeService service;
	
	@PostMapping("/login")
	public String getDetails(@RequestParam("uname") String uname, @RequestParam("password") String password, Model m) {
		
		m.addAttribute("uname",uname);
		m.addAttribute("password",password);
		return "links";
		
	}
	
	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee t1,Model m)
	{
		service.addTrainee(t1);
		m.addAttribute("traineeid", t1.getId());
		
		
		return "view";
	}
	
	@GetMapping("/deletetrainee")
	public String deleteTrainee(@RequestParam("traineeId") int id,Model m)
	{
		service.deleteTrainee(id);
		m.addAttribute("traineeid",id);
		

		return "view";
	}
	
	@PostMapping("/modifytrainee")
	public String modifyTrainee(@RequestParam("traineeId") int id, Model m)
	{
		m.addAttribute("trainee", service.find(id));
		return "update-trainee";
	}
	
	
	
}
