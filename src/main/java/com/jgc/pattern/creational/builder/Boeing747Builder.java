package com.jgc.pattern.creational.builder;

import com.jgc.pattern.creational.builder.model.Boeing747;
import com.jgc.pattern.creational.builder.model.IAircraft;

public class Boeing747Builder extends AircraftBuilder{

    Boeing747 boeing747;

    @Override
    public void buildEngine() {
        System.out.println("Building Boeing747 engine...");
    }

    @Override
    public void buildWings() {
        System.out.println("Building Boeing747 wings...");
    }

    @Override
    public void buildCockpit() {
        System.out.println("Building Boeing747 cockpit...");
    }

    @Override
    public void buildBathrooms() {
        System.out.println("Building Boeing747 bathrooms...");
    }

    public IAircraft getResult() {
        return boeing747;
    }
}
