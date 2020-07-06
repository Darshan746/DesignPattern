package com.darshan.design.pattern.facade;

public class B extends A {

    B(){
        super.m1();
    }
  public void m1()
  {
  System.out.print("Helo");
  }

  public static void main(String[] args) {
    A a = new B();

    a.m1();
  }
}
