package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("statusDAO")
public interface StatusDAO extends JpaRepository<Status, Integer> {
    Status findByStatus(String status);
}
