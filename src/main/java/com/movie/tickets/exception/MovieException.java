package com.movie.tickets.exception;

public class MovieException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public MovieException() {

	}

	public MovieException(String message) {
		this.message = message;
	}

}
