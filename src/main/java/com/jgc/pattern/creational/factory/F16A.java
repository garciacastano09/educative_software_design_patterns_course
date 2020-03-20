package com.jgc.pattern.creational.factory;

import com.jgc.pattern.creational.factory.model.F16AEngine;

public class F16A extends F16 {

    @Override
    protected F16 makeF16() {
        engine = new F16AEngine();
        return this;
    }
}
