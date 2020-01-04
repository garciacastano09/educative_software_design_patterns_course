package patterns.creational.builder;

import models.airplanes.Aircraft;


public class MainDirectorBased {

    public static void main(String[] args) {
        Boeing747Builder boeing747Builder = new Boeing747Builder();
        Director director = new Director(boeing747Builder);
        director.construct(true);
        Aircraft boeing747 = boeing747Builder.buildAircraft();

        F16Builder f16Builder = new F16Builder();
        director = new Director(f16Builder);
        director.construct(false);
        Aircraft f16 = f16Builder.buildAircraft();
    }
}
