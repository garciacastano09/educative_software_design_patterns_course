package patterns.creational.builder;

import models.airplanes.Aircraft;


public class MainDirectorSkipped {

    public static void main(String[] args) {
        Boeing747Builder boeing747Builder = new Boeing747Builder();
        F16Builder f16Builder = new F16Builder();
        Aircraft boeing747 = buildAircraft(boeing747Builder);
        Aircraft f16 = buildAircraft(f16Builder);
    }

    private static Aircraft buildAircraft(AircraftBuilder aircraftBuilder){
        aircraftBuilder.addCockpit();
        aircraftBuilder.addEngine();
        aircraftBuilder.addWings();
        aircraftBuilder.addBathrooms();
        return aircraftBuilder.buildAircraft();
    }
}
