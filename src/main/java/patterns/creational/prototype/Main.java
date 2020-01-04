package patterns.creational.prototype;

import models.airplanes.F16;
import models.parts.F16EngineA;
import models.parts.F16EngineB;

public class Main {
    public static void main(String[] args) {
        AircraftPrototype aircraftPrototype = new F16();

        AircraftPrototype cloneA = aircraftPrototype.clone();
        cloneA.setEngine(new F16EngineA());

        AircraftPrototype cloneB = aircraftPrototype.clone();
        cloneB.setEngine(new F16EngineB());
    }
}
