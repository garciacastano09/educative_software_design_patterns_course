package models.airplanes;

import models.parts.*;
import patterns.creational.prototype.AircraftPrototype;

public class Aircraft implements AircraftPrototype {

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

    public void fly() {
        System.out.println("Flying");
    }

    public AircraftPrototype clone() {
        return new Aircraft();
    }
}
