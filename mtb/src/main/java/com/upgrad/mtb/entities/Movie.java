package com.upgrad.mtb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Movie {
    //This is a used for primary key in DB
    @Id
    //This is used for auto generated unique id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( nullable = false)
    private String name;
    @Column( nullable = false)
    private String description;
    @Column( nullable = false)
    private Date releaseDate;
    @Column( nullable = false)
    private int duration;
    @Column( nullable = false)
    private String coverPhotoURL;
    @Column( nullable = false)
    private String trailerURL;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference("language_movie")
    private Language language;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference("status_movie")
    private Status status;


    /**
     * for oneToMany relationship we need a list of thetre
     */
    @OneToMany(mappedBy ="movie",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("movie_theatre")
    List<Theatre> theatres;

    public Movie() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoverPhotoURL() {
        return coverPhotoURL;
    }

    public void setCoverPhotoURL(String coverPhotoURL) {
        this.coverPhotoURL = coverPhotoURL;
    }

    public String getTrailerURL() {
        return trailerURL;
    }

    public void setTrailerURL(String trailerURL) {
        this.trailerURL = trailerURL;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", coverPhotoURL='" + coverPhotoURL + '\'' +
                ", trailerURL='" + trailerURL + '\'' +
                ", language=" + language +
                ", status=" + status +
                ", theatres=" + theatres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                duration == movie.duration &&
                Objects.equals(name, movie.name) &&
                Objects.equals(description, movie.description) &&
                Objects.equals(releaseDate, movie.releaseDate) &&
                Objects.equals(coverPhotoURL, movie.coverPhotoURL) &&
                Objects.equals(trailerURL, movie.trailerURL) &&
                Objects.equals(language, movie.language) &&
                Objects.equals(status, movie.status) &&
                Objects.equals(theatres, movie.theatres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, releaseDate, duration, coverPhotoURL, trailerURL, language, status, theatres);
    }
}
