package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("movieDAO")
/**
 * This @Repository is used for storing the data into the storage layer
 */
public interface MovieDAO extends JpaRepository<Movie, Integer> {

     Movie findByMovieName(String movieName);
}
