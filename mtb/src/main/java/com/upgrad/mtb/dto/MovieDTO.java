package com.upgrad.mtb.dto;

import com.upgrad.mtb.entities.Theatre;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MovieDTO{

    private String coverURL;
    private String description;
    private int duration;
    private String name;
    private Date releaseDate;
    private String trailerURL;
    private int languageId;
    private int statusId;
    private List<Theatre> theatres;

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

    public void setTheatre(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "coverURL='" + coverURL + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", trailerURL='" + trailerURL + '\'' +
                ", languageId='" + languageId + '\'' +
                ", statusId='" + statusId + '\'' +
                ", theatres=" + theatres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return duration == movieDTO.duration &&
                Objects.equals(coverURL, movieDTO.coverURL) &&
                Objects.equals(description, movieDTO.description) &&
                Objects.equals(name, movieDTO.name) &&
                Objects.equals(releaseDate, movieDTO.releaseDate) &&
                Objects.equals(trailerURL, movieDTO.trailerURL) &&
                Objects.equals(languageId, movieDTO.languageId) &&
                Objects.equals(statusId, movieDTO.statusId) &&
                Objects.equals(theatres, movieDTO.theatres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coverURL, description, duration, name, releaseDate, trailerURL, languageId, statusId, theatres);
    }
}
