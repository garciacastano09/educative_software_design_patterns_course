package com.jgc.pattern.creational.singleton;

public class AirForceOne {

    private static AirForceOne myInstance;

    private AirForceOne(){}

    public static AirForceOne getInstance(){
        if (myInstance == null){
            synchronized (AirForceOne.class){
                myInstance = new AirForceOne();
            }
        }
        return myInstance;
    }

    public void fly(){
        System.out.println("Flying...");
    }
}
