package com.darshan.designPattern.facade;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.print("Rectangle has drawn");
  }
}
