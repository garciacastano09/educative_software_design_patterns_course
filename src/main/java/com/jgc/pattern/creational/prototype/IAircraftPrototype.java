package com.jgc.pattern.creational.prototype;

import com.jgc.pattern.creational.prototype.model.F16Engine;

public interface IAircraftPrototype {

        void fly();

        IAircraftPrototype clone();

        void setEngine(F16Engine f16Engine);

}
