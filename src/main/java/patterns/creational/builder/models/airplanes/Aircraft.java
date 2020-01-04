package patterns.creational.builder.models.airplanes;

import patterns.creational.builder.models.parts.*;

public class Aircraft {

    private Cockpit cockpit;
    private Engine engine;
    private Wings wings;

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
