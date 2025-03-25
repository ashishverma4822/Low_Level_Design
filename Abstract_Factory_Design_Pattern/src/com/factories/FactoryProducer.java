package com.factories;

public class FactoryProducer {
    public static VehicleFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("LUXURY")){
            return new LuxuryFactory();
        }
        else if(factoryType.equalsIgnoreCase("ORDINARY")){
            return new OrdinaryFactory();
        }
        return null;
    }
}
