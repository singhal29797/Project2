package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingDAO")
public interface BookingDAO extends JpaRepository<Booking, Integer> {
}
