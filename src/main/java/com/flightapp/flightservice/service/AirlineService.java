package com.flightapp.flightservice.service;

import com.flightapp.flightservice.model.Airline;
import com.flightapp.flightservice.model.User;
import com.flightapp.flightservice.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {
    @Autowired
    AirlineRepository airlineRepository;

    public List<Airline> findAll() {
        return airlineRepository.findAll();
    }

    public Airline save(Airline data) {
        return airlineRepository.save(data);
    }
}
