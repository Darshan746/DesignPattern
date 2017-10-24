package com.darshan.designPattern.DecoratorDesignPattern;

public class OneBedRoomHouseWithSwimmingPool extends HouseDecorator
{

    public House house;

    public OneBedRoomHouseWithSwimmingPool(House house)
    {
        this.house = house;
    }

    @Override
    public String getDescription()
    {
        return "One BedRoom House With SwimmingPool";
    }

    @Override
    public double getPrice()
    {
        return house.getPrice() + 300000;
    }

}
