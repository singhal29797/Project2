package com.upgrad.mtb.services;

import com.upgrad.mtb.entities.Status;

import java.util.List;

public interface StatusService {

    public Status acceptStatusDetails(Status status);
    public Status getStatusDetails(int id);
    public Status getStatusDetailsByStatusName(String statusName);
    public boolean deleteStatus(int id);
    public List<Status> getAllStatusDetails();
}
