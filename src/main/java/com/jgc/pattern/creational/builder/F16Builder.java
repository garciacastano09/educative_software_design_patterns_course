package com.jgc.pattern.creational.builder;

import com.jgc.pattern.creational.builder.model.F16;
import com.jgc.pattern.creational.builder.model.IAircraft;

public class F16Builder extends AircraftBuilder{
    
    F16 f16;

    @Override
    public void buildEngine() {
        System.out.println("Building F16 engine...");
    }

    @Override
    public void buildWings() {
        System.out.println("Building F16 wings...");
    }
    
    @Override
    public void buildCockpit() {
        System.out.println("Building F16 cockpit...");
    }

    public IAircraft getResult() {
        return f16;
    }
}
