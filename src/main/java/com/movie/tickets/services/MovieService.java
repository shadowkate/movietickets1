package com.movie.tickets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.tickets.dto.SearchDto;
import com.movie.tickets.dto.SearchDto1;
import com.movie.tickets.entity.Movie;
import com.movie.tickets.entity.Theatre;

@Service
public interface MovieService {

	public List<Movie> getMovieList();

	public Movie getMovie(Integer id);

	public List<Theatre> getTheatreList();

	public List<SearchDto1> searchMovie(Integer a, Integer b);

}
