package com.movie.tickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.tickets.entity.MovieTheatre;

public interface MovieTheatreRepository extends JpaRepository<MovieTheatre, Integer>{

	List<MovieTheatre> findAllByMovieIdAndTheatreId(Integer movieId, Integer theatreId);

	List<MovieTheatre> findAllByMovieIdOrTheatreId(Integer a, Integer b);

}
