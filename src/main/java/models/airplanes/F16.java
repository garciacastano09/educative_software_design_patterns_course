package models.airplanes;

import patterns.creational.prototype.AircraftPrototype;

public class F16 extends Aircraft {

    public AircraftPrototype clone() {
        return new F16();
    }

}
