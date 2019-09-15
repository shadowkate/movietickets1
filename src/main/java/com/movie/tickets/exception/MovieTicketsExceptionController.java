package com.movie.tickets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.movie.tickets.dto.Message;

@ControllerAdvice
public class MovieTicketsExceptionController {
	
	
	@ExceptionHandler(value=MovieException.class)
	public ResponseEntity<Message> exception(MovieException exception){
		Message message = new Message();
		message.setMessage(exception.getMessage());
		return new ResponseEntity<Message>(message,HttpStatus.NOT_FOUND);
	}
}
	