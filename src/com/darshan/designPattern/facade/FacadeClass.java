package com.darshan.designPattern.facade;

public class FacadeClass {
  private Shape circle;
  private Shape rectangle ;

  FacadeClass(){
    circle = new Circle();
    rectangle = new Rectangle();
  }

  public void drawCircle(){
    circle.draw();
  }

  public void drawRectangle(){
    rectangle.draw();
  }
}
