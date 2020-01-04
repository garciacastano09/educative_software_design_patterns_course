package patterns.creational.builder;

import patterns.creational.builder.models.airplanes.Aircraft;

public interface AircraftBuilder {

    void addEngine();

    void addWings();

    void addCockpit();

    void addBathrooms();

    Aircraft buildAircraft();
}