package com.lot.service;

import com.lot.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleServiceIMPL implements VehicleService{
    @Override
    public List<Vehicle> findAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Iterable<Vehicle> vehicleItr = vehicleRepository.findAll();
        vehicleItr.forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
