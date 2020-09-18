package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.EshopOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EshopOrderDAO")
public interface EshopOrderDAO extends JpaRepository<EshopOrder, Integer> {


}
