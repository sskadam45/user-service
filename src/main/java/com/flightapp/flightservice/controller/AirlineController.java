package com.flightapp.flightservice.controller;

import com.flightapp.flightservice.model.Airline;
import com.flightapp.flightservice.model.Inventory;
import com.flightapp.flightservice.model.User;
import com.flightapp.flightservice.service.AirlineService;
import com.flightapp.flightservice.service.InventoryService;
import com.flightapp.flightservice.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class AirlineController {
    @Autowired
    AirlineService airlineService;

    @Autowired
    InventoryService inventoryService;

    @GetMapping("airlines")
    List<Airline> getAllAirlines(){
        return airlineService.findAll();
    }

    @PostMapping("airline/register")
    Airline registerFlight(@RequestBody Airline data){
        return airlineService.save(data);
    }

    @PostMapping("airline/inventory/add")
    Inventory addFlight(@RequestBody Inventory data){
        return inventoryService.save(data);
    }



}
