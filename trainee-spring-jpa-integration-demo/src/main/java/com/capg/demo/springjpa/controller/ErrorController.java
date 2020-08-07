package com.capg.demo.springjpa.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.springjpa.errors.InvalidDOBException;
import com.capg.demo.springjpa.errors.TraineeAlreadyExistsException;
import com.capg.demo.springjpa.model.ErrorResponse;



@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {TraineeAlreadyExistsException.class,InvalidDOBException.class})
	public ErrorResponse handleTraineeAlreadyExistsException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
}
