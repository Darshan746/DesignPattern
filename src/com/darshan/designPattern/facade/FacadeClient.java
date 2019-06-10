package com.darshan.designPattern.facade;

public class FacadeClient {

  public static void main(String[] args) {
    FacadeClass facadeClass = new FacadeClass();
    facadeClass.drawCircle();
    facadeClass.drawRectangle();
  }
}
