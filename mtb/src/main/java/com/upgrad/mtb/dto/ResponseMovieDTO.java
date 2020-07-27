package com.upgrad.mtb.dto;

import com.upgrad.mtb.entities.Theatre;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ResponseMovieDTO {

    int movieId;
    String coverURL;
    String description;
    int duration;
    String name;
    Date releaseDate;
    String trailerURL;
    int languageId;
    int statusId;
    List<Theatre> theatres;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerURL() {
        return trailerURL;
    }

    public void setTrailerURL(String trailerURL) {
        this.trailerURL = trailerURL;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "ResponseMovieDTO{" +
                "movieId=" + movieId +
                ", coverURL='" + coverURL + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", trailerURL='" + trailerURL + '\'' +
                ", languageId=" + languageId +
                ", statusId=" + statusId +
                ", theatres=" + theatres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseMovieDTO that = (ResponseMovieDTO) o;
        return movieId == that.movieId &&
                duration == that.duration &&
                languageId == that.languageId &&
                statusId == that.statusId &&
                Objects.equals(coverURL, that.coverURL) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(releaseDate, that.releaseDate) &&
                Objects.equals(trailerURL, that.trailerURL) &&
                Objects.equals(theatres, that.theatres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, coverURL, description, duration, name, releaseDate, trailerURL, languageId, statusId, theatres);
    }
}
