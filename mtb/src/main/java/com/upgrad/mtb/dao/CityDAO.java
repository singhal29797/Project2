package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cityDAO")
public interface CityDAO extends JpaRepository<City, Integer> {
    City findByCity(String city);
}
