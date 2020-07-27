package com.upgrad.mtb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String theatreName;

    @Column(nullable = false)
    private int noOfSeats;

    @Column(nullable = false)
    private int ticketPrice;

    @ManyToOne
    @JsonBackReference("city_theatre")
    private City city;

    @OneToMany(mappedBy = "theatre", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("theatre_booking")
    private List<Booking> bookings;

    @ManyToOne
    @JsonBackReference("movie_theatre")
    private Movie movie;

    public Theatre() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "id=" + id +
                ", theatreName='" + theatreName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", ticketPrice=" + ticketPrice +
                ", city=" + city +
                ", bookings=" + bookings +
                ", movie=" + movie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return id == theatre.id &&
                noOfSeats == theatre.noOfSeats &&
                ticketPrice == theatre.ticketPrice &&
                Objects.equals(theatreName, theatre.theatreName) &&
                Objects.equals(city, theatre.city) &&
                Objects.equals(bookings, theatre.bookings) &&
                Objects.equals(movie, theatre.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, theatreName, noOfSeats, ticketPrice, city, bookings, movie);
    }
}
