package com.darshan.design.pattern.abstractfactory;

public class DBDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Dept to DB");
    }
}
