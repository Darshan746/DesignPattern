package com.darshan.design.pattern.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
          AbstractFactory abstractFactory;
        if(factoryType.equalsIgnoreCase("xml")){
            abstractFactory = new XMLFacory();
        }else {
            abstractFactory = new DBFactory();
        }
        return abstractFactory;
    }
}
