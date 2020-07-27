package com.upgrad.mtb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private Date bookingDate;

    @Column(nullable = false)
    private int noOfSeats;

    @ManyToOne
    @JsonBackReference("theatre_booking")
    private Theatre theatre;

    @ManyToOne
    @JsonBackReference("customer_booking")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", bookingDate=" + bookingDate +
                ", noOfSeats=" + noOfSeats +
                ", theatre=" + theatre +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id &&
                noOfSeats == booking.noOfSeats &&
                Objects.equals(bookingDate, booking.bookingDate) &&
                Objects.equals(theatre, booking.theatre) &&
                Objects.equals(customer, booking.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookingDate, noOfSeats, theatre, customer);
    }
}
