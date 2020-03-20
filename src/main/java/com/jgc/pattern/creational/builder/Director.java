package com.jgc.pattern.creational.builder;

public class Director {

    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder){
        this.aircraftBuilder = aircraftBuilder;
    }

    public void construct(boolean passengers){
        aircraftBuilder.buildWings();
        aircraftBuilder.buildBathrooms();
        aircraftBuilder.buildCockpit();

        if (passengers){
            aircraftBuilder.buildBathrooms();
        }
    }

}
