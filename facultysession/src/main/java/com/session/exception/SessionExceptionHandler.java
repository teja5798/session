package com.session.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SessionExceptionHandler {
   @ExceptionHandler(SessionException.class)
	public ResponseEntity <String> handleException(Exception ex){
		return new ResponseEntity <String> ("Error : "+ex.getMessage(), HttpStatus.CONFLICT);
		
	}

}
