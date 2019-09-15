package com.movie.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.tickets.entity.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer>{

}
