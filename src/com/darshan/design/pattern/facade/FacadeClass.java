package com.darshan.design.pattern.facade;

class FacadeClass {
  private Shape circle;
  private Shape rectangle ;

  FacadeClass(){
    circle = new Circle();
    rectangle = new Rectangle();
  }

  void drawCircle(){
    circle.draw();
  }

  void drawRectangle(){
    rectangle.draw();
  }
}
