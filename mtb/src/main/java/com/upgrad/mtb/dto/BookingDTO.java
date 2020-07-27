package com.upgrad.mtb.dto;

import java.util.Date;
import java.util.Objects;

public class BookingDTO {

    private Date bookingDate;
    private int noOfSeats;
    private int customerId;
    private int theatreId;

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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bookingDate=" + bookingDate +
                ", noOfSeats=" + noOfSeats +
                ", customerId=" + customerId +
                ", theatreId=" + theatreId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingDTO that = (BookingDTO) o;
        return noOfSeats == that.noOfSeats &&
                customerId == that.customerId &&
                theatreId == that.theatreId &&
                Objects.equals(bookingDate, that.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingDate, noOfSeats, customerId, theatreId);
    }
}
