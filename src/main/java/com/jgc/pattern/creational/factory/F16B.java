package com.jgc.pattern.creational.factory;

import com.jgc.pattern.creational.factory.model.F16BEngine;

public class F16B extends F16 {

    @Override
    protected F16 makeF16() {
        engine = new F16BEngine();
        return this;
    }
}
