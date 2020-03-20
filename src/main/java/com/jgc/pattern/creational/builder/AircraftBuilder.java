package com.jgc.pattern.creational.builder;

import com.jgc.pattern.creational.builder.model.IAircraft;

public abstract class AircraftBuilder {

    public void buildEngine() {
        System.out.println("Building engine...");
    }

    public void buildWings() {
        System.out.println("Building wings...");
    }

    public void buildCockpit() {
        System.out.println("Building cockpit...");
    }

    public void buildBathrooms() {
        System.out.println("Building bathrooms...");
    }

    abstract public IAircraft getResult();
}
