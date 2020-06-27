package com.darshan.designPattern.abstractfactory;

public class TestClass {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory("xml");
       Dao dao =  abstractFactory.createDao("emp");
       dao.save();


        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("xml");
        Dao dao1 =  abstractFactory1.createDao("dept");
        dao1.save();



        AbstractFactory abstractFactory11 = FactoryProducer.getFactory("db");
        Dao dao11 =  abstractFactory11.createDao("emp");
        dao11.save();

        AbstractFactory abstractFactory111 = FactoryProducer.getFactory("db");
        Dao dao111 =  abstractFactory111.createDao("db");
        dao111.save();

    }
}
