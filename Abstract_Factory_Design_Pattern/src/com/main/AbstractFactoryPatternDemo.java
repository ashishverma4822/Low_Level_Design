package com.main;

import com.factories.FactoryProducer;
import com.factories.VehicleFactory;
import com.vehicles.Vehicle;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get Luxury Vehicle Factory
        VehicleFactory luxuryFactory = FactoryProducer.getFactory("LUXURY");

        Vehicle luxury1 = luxuryFactory.getVehicle("LUXURY1");
        luxury1.drive();

        Vehicle luxury2 = luxuryFactory.getVehicle("LUXURY2");
        luxury2.drive();

        // Get Ordinary Vehicle Factory
        VehicleFactory ordinaryFactory = FactoryProducer.getFactory("ORDINARY");

        Vehicle ordinary1 = ordinaryFactory.getVehicle("ORDINARY1");
        ordinary1.drive();

        Vehicle ordinary2 = ordinaryFactory.getVehicle("ORDINARY2");
        ordinary2.drive();

    }
}
