package com.jgc.pattern.creational.builder;

import com.jgc.pattern.creational.builder.model.IAircraft;

public class Client {

    public static void main(String[] args) {

        AircraftBuilder f16Builder = new F16Builder();
        AircraftBuilder boeing747Builder = new Boeing747Builder();

        // Boeing747 with Director
        Director directorBoeing747 = new Director(boeing747Builder);
        directorBoeing747.construct(true);
        IAircraft boeing747 = boeing747Builder.getResult();

        // F16 with Director
        Director directorF16 = new Director(f16Builder);
        directorF16.construct(false);
        IAircraft f16 = f16Builder.getResult();

        // F16 without Director
        boeing747Builder.buildWings();
        boeing747Builder.buildCockpit();
        boeing747Builder.buildEngine();
        boeing747Builder.buildBathrooms();
        boeing747Builder.getResult();

        // F16 without Director
        f16Builder.buildWings();
        f16Builder.buildCockpit();
        f16Builder.buildEngine();
        f16Builder.getResult();
    }

}
