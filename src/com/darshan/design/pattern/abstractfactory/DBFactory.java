package com.darshan.design.pattern.abstractfactory;

public class DBFactory extends AbstractFactory {
    @Override
    Dao createDao(String type) {

        Dao dao =null;
        if(type.equalsIgnoreCase("emp")){
            dao=  new DBEmpDao();
        }else
        {
            dao =  new DBDeptDao();
        }
        return dao;
    }
}
