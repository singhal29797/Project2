package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("theatreDAO")
public interface TheatreDAO extends JpaRepository<Theatre, Integer> {
}
