package com.movie.tickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.tickets.dto.SearchDto;
import com.movie.tickets.dto.SearchDto1;
import com.movie.tickets.entity.Movie;
import com.movie.tickets.entity.Theatre;
import com.movie.tickets.services.MovieService;

@RestController
@RequestMapping("/tickets")
public class MovieTicketsController {

	@Autowired
	MovieService movieService;

	@GetMapping("/movieList")
	public ResponseEntity<List<Movie>> getMovieList() {

		return new ResponseEntity<List<Movie>>(movieService.getMovieList(), HttpStatus.OK);
	}

	@GetMapping("/movie/{id}")
	public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
		return new ResponseEntity<Movie>(movieService.getMovie(id), HttpStatus.OK);
	}

	@GetMapping("/theatreList")
	public ResponseEntity<List<Theatre>> getTheatreList() {

		return new ResponseEntity<>(movieService.getTheatreList(), HttpStatus.OK);
	}

	@GetMapping("/search")
	public ResponseEntity<List<SearchDto1>> searchMovie(@RequestParam(required = false) Integer a,
			@RequestParam(required = false) Integer b) {
		return new ResponseEntity<>(movieService.searchMovie(a, b), HttpStatus.OK);
	}
}
