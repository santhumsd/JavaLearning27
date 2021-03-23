package io.javabrainssrpingboot.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.javabrainssrpingboot.exception.InvalidBodyException;

@ControllerAdvice
public class InvalidBodyExceptionHandler {

	@ExceptionHandler({InvalidBodyException.class})//by mentioning the class name it will only look into those type of exception,we can add multiple classes using comma to handle all those exception
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String courseExceptionHandler(InvalidBodyException e) {
		return e.getMessage();
		
	}
}
