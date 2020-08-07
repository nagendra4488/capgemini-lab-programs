package com.capg.demo.product.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.product.errors.ProductAlreadyExistsException;
import com.capg.demo.product.errors.ProductNotFoundException;
import com.capg.demo.product.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {ProductAlreadyExistsException.class})
	public ErrorResponse handleProductAlreadyExistsException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
	
	
	@ResponseStatus(code = HttpStatus.REQUEST_TIMEOUT)
	@ExceptionHandler(value =  {ProductNotFoundException.class})
	public ErrorResponse handleProductNotFoundException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.REQUEST_TIMEOUT.getReasonPhrase(), HttpStatus.REQUEST_TIMEOUT.value(), req.getRequestURI());
	}
	
	
}
