package com.upgrad.mtb.controllers;

import com.upgrad.mtb.dto.MovieDTO;
import com.upgrad.mtb.dto.ResponseMovieDTO;
import com.upgrad.mtb.entities.Movie;
import com.upgrad.mtb.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity newMovie(@RequestBody MovieDTO movieDTO){
        ResponseEntity responseEntity = null;
            Movie responseMovie = movieService.acceptMovieDetails(movieDTO);
            ResponseMovieDTO newMovieDTO = new ResponseMovieDTO();
            newMovieDTO.setMovieId(responseMovie.getId());
            newMovieDTO.setName(responseMovie.getName());
            newMovieDTO.setReleaseDate(responseMovie.getReleaseDate());
            newMovieDTO.setCoverURL(responseMovie.getCoverPhotoURL());
            newMovieDTO.setTrailerURL(responseMovie.getTrailerURL());
            newMovieDTO.setDescription(responseMovie.getDescription());
            newMovieDTO.setDuration(responseMovie.getDuration());
            newMovieDTO.setStatusId(responseMovie.getStatus().getId());
            newMovieDTO.setLanguageId(responseMovie.getLanguage().getId());
            newMovieDTO.setTheatres(responseMovie.getTheatres());
            responseEntity = ResponseEntity.ok(newMovieDTO);
        return responseEntity;
    }

    /*@GetMapping("/{id}")
    public ResponseEntity getMovieDetails(@PathVariable(name = "id") int id){

    }
*/
}
