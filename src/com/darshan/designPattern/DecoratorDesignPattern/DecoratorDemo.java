package com.darshan.designPattern.DecoratorDesignPattern;

public class DecoratorDemo
{

    public static void main(String args[])
    {
        House plainHouse = new OneBedRoomHouse();
        System.out.println("Description:" + plainHouse.getDescription() + " " + "Price is " + plainHouse.getPrice());

        House singleBedWithCarParking = new OneBedRoomHouseWithCarParking(new OneBedRoomHouse());

        System.out.println("Description:" + singleBedWithCarParking.getDescription() + " " + "Price is " + singleBedWithCarParking.getPrice());

        House singleBedWithSwimmingPool = new OneBedRoomHouseWithSwimmingPool(new OneBedRoomHouse());

        System.out.println("Description:" + singleBedWithSwimmingPool.getDescription() + " " + "Price is " + singleBedWithSwimmingPool.getPrice());
    }
}
