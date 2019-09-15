package com.movie.tickets.dto;

public class SearchDto {
	
	private Integer movieId;
	private Integer theatreId;
	
	
	public SearchDto() {
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	
	
}
