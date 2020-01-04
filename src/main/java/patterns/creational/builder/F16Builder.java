package patterns.creational.builder;

import models.airplanes.F16;
import models.airplanes.Aircraft;
import models.parts.F16Cockpit;
import models.parts.F16Engine;
import models.parts.F16Wings;

public class F16Builder implements AircraftBuilder {

    private F16 f16;

    public F16Builder(){
        f16 = new F16();
    }

    public void addEngine() {
        f16.setEngine(new F16Engine());
    }

    public void addWings() {
        f16.setWings(new F16Wings());
    }

    public void addCockpit() {
        f16.setCockpit(new F16Cockpit());
    }

    public void addBathrooms() {}

    public Aircraft buildAircraft() {
        return f16;
    }
}
