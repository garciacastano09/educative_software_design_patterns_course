package patterns.creational.builder;

import patterns.creational.builder.AircraftBuilder;

public class Director {
    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }

    public void construct(boolean isPassenger) {
        aircraftBuilder.addCockpit();
        aircraftBuilder.addEngine();
        aircraftBuilder.addWings();

        if (isPassenger)
            aircraftBuilder.addBathrooms();
    }
}
