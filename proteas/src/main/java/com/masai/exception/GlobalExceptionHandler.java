package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(NoProjectFound.class)
	public ResponseEntity<NoProjectFound> NoprojectFoundExceptionHandler(NoProjectFound ex) {
		
		return new ResponseEntity<NoProjectFound>(HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Exception> ExceptionHandler(Exception ex) {
		
		return new ResponseEntity<Exception>(HttpStatus.BAD_REQUEST);
		
	}
}
