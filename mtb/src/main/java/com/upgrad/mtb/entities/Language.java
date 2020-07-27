package com.upgrad.mtb.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(unique = true,nullable = false)
    private String language;

    /**
     * @fetch = fetching is fast
     * @cascasde = if the change happen with this one... all the associated class wiill also be changed
     */
    @OneToMany(mappedBy = "language" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("language_movie")
    List<Movie> movies;

    public Language() {}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Language{" +
                "Id=" + Id +
                ", language='" + language + '\'' +
                ", movies=" + movies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language1 = (Language) o;
        return Id == language1.Id &&
                Objects.equals(language, language1.language) &&
                Objects.equals(movies, language1.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, language, movies);
    }
}
