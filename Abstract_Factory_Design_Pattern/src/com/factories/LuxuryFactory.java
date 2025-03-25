package com.factories;

import com.vehicles.Luxury1;
import com.vehicles.Luxury2;
import com.vehicles.Vehicle;

public class LuxuryFactory extends VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("LUXURY1")){
            return new Luxury1();
        }
        else if(vehicleType.equalsIgnoreCase("LUXURY2")){
            return new Luxury2();
        }
        return null;
    }
}
