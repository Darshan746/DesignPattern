package com.darshan.design.pattern.abstractfactory;

public abstract class AbstractFactory {
    abstract Dao createDao( String factoryType);
}
