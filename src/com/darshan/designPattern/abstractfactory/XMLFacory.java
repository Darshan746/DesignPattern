package com.darshan.designPattern.abstractfactory;

public class XMLFacory extends AbstractFactory {
    @Override
    Dao createDao(String factoryType) {
        Dao dao =null;
        if(factoryType.equalsIgnoreCase("emp")){
            dao=  new XMLEmpDao();
        }else
        {
            dao =  new XMLDeptDao();
        }
        return dao;
    }
}
