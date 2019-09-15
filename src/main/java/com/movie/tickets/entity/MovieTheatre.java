package com.movie.tickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MovieTheatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieTheatreId;
	
	private Integer movieId;
	private Integer theatreId;
	public Integer getMovieTheatreId() {
		return movieTheatreId;
	}
	public void setMovieTheatreId(Integer movieTheatreId) {
		this.movieTheatreId = movieTheatreId;
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
