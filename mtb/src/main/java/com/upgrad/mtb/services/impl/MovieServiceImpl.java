package com.upgrad.mtb.services.impl;

import com.upgrad.mtb.dao.MovieDAO;
import com.upgrad.mtb.dto.MovieDTO;
import com.upgrad.mtb.entities.Movie;
import com.upgrad.mtb.services.LanguageService;
import com.upgrad.mtb.services.MovieService;
import com.upgrad.mtb.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    @Qualifier("movieDAO")
    private MovieDAO movieDAO;

    @Autowired
    private LanguageService languageService;

    @Autowired
    @Qualifier("statusService")
    private StatusService statusService;


    @Override
    public Movie acceptMovieDetails(MovieDTO movieDTO) {
        Movie movie = new Movie();
        movie.setCoverPhotoURL(movieDTO.getCoverURL());
        movie.setDescription(movieDTO.getDescription());
        movie.setDuration(movieDTO.getDuration());
        movie.setLanguage(languageService.getLanguageDetails(movieDTO.getLanguageId()));
        movie.setName(movieDTO.getName());
        movie.setStatus(statusService.getStatusDetails(movieDTO.getStatusId()));
        movie.setReleaseDate(movieDTO.getReleaseDate());
        movie.setTheatres(movieDTO.getTheatres());
        return movieDAO.save(movie);
    }

    @Override
    public Movie getMovieDetails(int id) {
        return movieDAO.findById(id).get();
    }

    @Override
    public List<Movie> getAllMovieDetails() {
        return movieDAO.findAll();
    }

    @Override
    public Movie updateMovieDetails(int id, MovieDTO movieDTO) {
        Movie initialMovie = getMovieDetails(id);
        System.out.println("Initial movie details : " + initialMovie.toString());
        initialMovie.setName(movieDTO.getName());
        initialMovie.setCoverPhotoURL(movieDTO.getCoverURL());
        initialMovie.setTrailerURL(movieDTO.getTrailerURL());
        initialMovie.setDuration(movieDTO.getDuration());
        initialMovie.setDescription(movieDTO.getDescription());
        initialMovie.setReleaseDate(movieDTO.getReleaseDate());
        initialMovie.setTheatres(movieDTO.getTheatres());
        initialMovie.setLanguage(languageService.getLanguageDetails(movieDTO.getLanguageId()));
        initialMovie.setStatus(statusService.getStatusDetails(movieDTO.getStatusId()));
        return movieDAO.save(initialMovie);
    }

    @Override
    public boolean deleteMovie(int id) {
        Movie movie = getMovieDetails(id);
        movieDAO.delete(movie);
        return true;
    }
}
