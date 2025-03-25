package com.factories;

import com.vehicles.Ordinary1;
import com.vehicles.Ordinary2;
import com.vehicles.Vehicle;

public class OrdinaryFactory extends VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("ORDINARY1")){
            return new Ordinary1();
        }
        else if(vehicleType.equalsIgnoreCase("ORDINARY2")){
            return new Ordinary2();
        }
        return null;
    }
}
