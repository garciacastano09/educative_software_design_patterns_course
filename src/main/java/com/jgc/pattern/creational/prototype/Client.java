package com.jgc.pattern.creational.prototype;

import com.jgc.pattern.creational.prototype.model.F16AEngine;
import com.jgc.pattern.creational.prototype.model.F16BEngine;

public class Client {

    public static void main(String[] args) {
        IAircraftPrototype prototype = new F16();

        // Create F16-A
        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16AEngine());

        // Create F16-B
        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine(new F16BEngine());
    }
}
