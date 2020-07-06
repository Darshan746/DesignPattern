package com.darshan.design.pattern.facade;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.print("Rectangle has drawn");
  }
}
