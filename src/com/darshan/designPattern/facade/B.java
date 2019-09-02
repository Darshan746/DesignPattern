package com.darshan.designPattern.facade;

public class B extends A {

  public void m1(){
  System.out.print("Helo");
  }

  public static void main(String[] args) {
    A a = new B();
    a.m1();
  }
}
