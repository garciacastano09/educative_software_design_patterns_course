package models.airplanes;

import models.parts.Boeing747Bathroom;
import patterns.creational.prototype.AircraftPrototype;

public class Boeing747 extends Aircraft {

    private Boeing747Bathroom boeing747Bathroom;

    public Boeing747Bathroom getBoeing747Bathroom() {
        return boeing747Bathroom;
    }

    public void setBoeing747Bathroom(Boeing747Bathroom boeing747Bathroom) {
        this.boeing747Bathroom = boeing747Bathroom;
    }

    public AircraftPrototype clone() {
        return new Boeing747();
    }

}
