package com.movie.tickets.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.tickets.dto.SearchDto;
import com.movie.tickets.dto.SearchDto1;
import com.movie.tickets.entity.Movie;
import com.movie.tickets.entity.MovieTheatre;
import com.movie.tickets.entity.Theatre;
import com.movie.tickets.exception.MovieException;
import com.movie.tickets.repository.MovieRepository;
import com.movie.tickets.repository.MovieTheatreRepository;
import com.movie.tickets.repository.TheatreRepository;

@Service
public class MovieServicesImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	TheatreRepository theatreRepository;

	@Autowired
	MovieTheatreRepository movieTheatreRepository;

	@Override
	public List<Movie> getMovieList() {

		List<Movie> list = movieRepository.findAll();
		return list;
	}

	@Override
	public Movie getMovie(Integer id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public List<Theatre> getTheatreList() {
		return theatreRepository.findAll();
	}

	@Override
	public List<SearchDto1> searchMovie(Integer a, Integer b) {
		if (a != null && b != null) {
			List<MovieTheatre> list = movieTheatreRepository.findAllByMovieIdAndTheatreId(a, b);

			List<SearchDto1> listSearch = new ArrayList<>();

			for (MovieTheatre list1 : list) {
				Movie movie = movieRepository.findById(list1.getMovieId()).get();
				Theatre theatre = theatreRepository.findById(list1.getTheatreId()).get();
				SearchDto1 searchDto1 = new SearchDto1();
				searchDto1.setMovieId(movie.getMovieId());
				searchDto1.setMovieName(movie.getMovieName());
				searchDto1.setTheatreId(theatre.getTheatreId());
				searchDto1.setTheatreName(theatre.getTheatreName());
				searchDto1.setLocation(theatre.getLocation());
				listSearch.add(searchDto1);
			}
			return listSearch;
		} else if (a == null) {
			List<MovieTheatre> list = movieTheatreRepository.findAllByMovieIdOrTheatreId(a, b);

			List<SearchDto1> listSearch = new ArrayList<>();

			for (MovieTheatre list1 : list) {
				Movie movie = movieRepository.findById(list1.getMovieId()).get();
				Theatre theatre = theatreRepository.findById(list1.getTheatreId()).get();
				SearchDto1 searchDto1 = new SearchDto1();
				searchDto1.setMovieId(movie.getMovieId());
				searchDto1.setMovieName(movie.getMovieName());
				searchDto1.setTheatreId(theatre.getTheatreId());
				searchDto1.setTheatreName(theatre.getTheatreName());
				searchDto1.setLocation(theatre.getLocation());
				listSearch.add(searchDto1);
			}
			return listSearch;
		} else if (b == null) {
			List<MovieTheatre> list = movieTheatreRepository.findAllByMovieIdOrTheatreId(a, b);

			List<SearchDto1> listSearch = new ArrayList<>();

			for (MovieTheatre list1 : list) {
				Movie movie = movieRepository.findById(list1.getMovieId()).get();
				Theatre theatre = theatreRepository.findById(list1.getTheatreId()).get();
				SearchDto1 searchDto1 = new SearchDto1();
				searchDto1.setMovieId(movie.getMovieId());
				searchDto1.setMovieName(movie.getMovieName());
				searchDto1.setTheatreId(theatre.getTheatreId());
				searchDto1.setTheatreName(theatre.getTheatreName());
				searchDto1.setLocation(theatre.getLocation());
				listSearch.add(searchDto1);
			}
			return listSearch;
		}else {
			 throw new MovieException("records not available");
		}
	}

}
