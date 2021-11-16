package com.flightapp.flightservice.repository;

import com.flightapp.flightservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
