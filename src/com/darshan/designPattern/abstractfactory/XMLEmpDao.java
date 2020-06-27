package com.darshan.designPattern.abstractfactory;

public class XMLEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("saving EMP to XML");
    }
}
