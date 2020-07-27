package com.upgrad.mtb.services.impl;

import com.upgrad.mtb.dao.StatusDAO;
import com.upgrad.mtb.entities.Status;
import com.upgrad.mtb.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("statusService")
public class StatusServiceImpl implements StatusService {

    @Autowired
    @Qualifier("statusDAO")
    private StatusDAO statusDAO;

    @Override
    public Status acceptStatusDetails(Status status) {
        return statusDAO.save(status);
    }

    @Override
    public Status getStatusDetails(int id) {
        return statusDAO.findById(id).get();
    }

    @Override
    public Status getStatusDetailsByStatusName(String statusName) {
        return statusDAO.findByStatus(statusName);
    }

    @Override
    public boolean deleteStatus(int id) {
        Status status = getStatusDetails(id);
        statusDAO.delete(status);
        return true;
    }

    @Override
    public List<Status> getAllStatusDetails() {
        return statusDAO.findAll();
    }
}
