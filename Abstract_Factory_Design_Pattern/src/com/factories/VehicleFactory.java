package com.factories;

import com.vehicles.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle getVehicle(String vehicleType);
}
