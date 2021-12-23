package com.company.design.decorator;

public class A3 extends AudiDecorator{
    //  Alt Enter: constructor
    public A3(ICar audi, String modelName) {
        super(audi, modelName, 1000);
    }
}
