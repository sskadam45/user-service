package com.flightapp.flightservice.service;

import com.flightapp.flightservice.model.Airline;
import com.flightapp.flightservice.model.Inventory;
import com.flightapp.flightservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory save(Inventory data) {
      return  inventoryRepository.save(data);
    }
}
