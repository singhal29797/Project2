package com.upgrad.mtb.dto;

import com.upgrad.mtb.entities.Booking;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TheatreDTO {

    private String theatreName;
    private int noOfSeats;
    private int ticketPrice;
    private int cityId;
    private int movieId;
    private List<Booking> bookings;

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "TheatreDTO{" +
                "theatreName='" + theatreName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", ticketPrice=" + ticketPrice +
                ", cityId=" + cityId +
                ", movieId=" + movieId +
                ", bookings=" + bookings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheatreDTO that = (TheatreDTO) o;
        return noOfSeats == that.noOfSeats &&
                ticketPrice == that.ticketPrice &&
                cityId == that.cityId &&
                movieId == that.movieId &&
                Objects.equals(theatreName, that.theatreName) &&
                Objects.equals(bookings, that.bookings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theatreName, noOfSeats, ticketPrice, cityId, movieId, bookings);
    }
}
