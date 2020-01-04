package patterns.creational.prototype;

import models.parts.Engine;

public interface AircraftPrototype {

    void fly();

    AircraftPrototype clone();

    void setEngine(Engine engine);
}