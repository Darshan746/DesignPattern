package com.darshan.designPattern.abstractfactory;

public class DBDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Dept to DB");
    }
}
