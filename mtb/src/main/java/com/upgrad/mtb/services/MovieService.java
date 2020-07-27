package com.upgrad.mtb.services;

import com.upgrad.mtb.dto.MovieDTO;
import com.upgrad.mtb.entities.Movie;

import java.util.List;

public interface MovieService {

    public Movie acceptMovieDetails(MovieDTO movieDTO);
    public List<Movie> getAllMovieDetails();
    public Movie getMovieDetails(int id);
    public Movie updateMovieDetails(int id, MovieDTO movieDTO);
    public boolean deleteMovie(int id);
}
