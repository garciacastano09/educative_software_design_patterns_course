package com.jgc.pattern.creational.singleton;

public class Client {

    public static void main(String[] args) {
        AirForceOne airForceOne = AirForceOne.getInstance();
        airForceOne.fly();
    }
}
