package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.service.MovieInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController	
public class MovieController {

	
	@Autowired
	MovieInfoService service;
	
	@GetMapping("/info/id/{id}")
	@HystrixCommand(fallbackMethod = "getMovieInfoFallback")
	public MovieInfo getMovieInfo(@PathVariable int id) {
		return service.getMovieInfo(id);
	}
	
	@PostMapping("/info/add")
	public MovieInfo addMovieInfo(@RequestBody MovieInfo info) {
		return service.addMovieInfo(info);
	}
	public MovieInfo getMovieInfoFallback(@PathVariable int id) {
		return new MovieInfo(id, "3 Idiots", 4.9);
	}
	
	
}
