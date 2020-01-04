package patterns.creational.builder;

import models.airplanes.Boeing747;
import models.airplanes.Aircraft;
import models.parts.Boeing747Bathroom;
import models.parts.Boeing747Cockpit;
import models.parts.Boeing747Engine;
import models.parts.Boeing747Wings;

public class Boeing747Builder implements AircraftBuilder {

    private Boeing747 boeing747;

    public Boeing747Builder(){
        boeing747 = new Boeing747();
    }

    public void addEngine() {
        boeing747.setEngine(new Boeing747Engine());
    }

    public void addWings() {
        boeing747.setWings(new Boeing747Wings());
    }

    public void addCockpit() {
        boeing747.setCockpit(new Boeing747Cockpit());
    }

    public void addBathrooms() {
        boeing747.setBoeing747Bathroom(new Boeing747Bathroom());
    }

    public Aircraft buildAircraft() {
        return boeing747;
    }
}
