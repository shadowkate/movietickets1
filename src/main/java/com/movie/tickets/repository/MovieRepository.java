package com.movie.tickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.tickets.entity.Movie;
import com.movie.tickets.entity.MovieTheatre;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{


}
