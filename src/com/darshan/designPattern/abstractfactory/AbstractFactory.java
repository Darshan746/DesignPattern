package com.darshan.designPattern.abstractfactory;

public abstract class AbstractFactory {
    abstract Dao createDao( String factoryType);
}
