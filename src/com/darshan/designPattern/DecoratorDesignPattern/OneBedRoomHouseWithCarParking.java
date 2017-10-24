package com.darshan.designPattern.DecoratorDesignPattern;

public class OneBedRoomHouseWithCarParking extends HouseDecorator
{

    private House house;

    public OneBedRoomHouseWithCarParking(House house)
    {
        this.house = house;
    }

    @Override
    public String getDescription()
    {
        return "One BedRoom HouseWith CarParking";
    }

    @Override
    public double getPrice()
    {
        return house.getPrice() + 2000;
    }

}
