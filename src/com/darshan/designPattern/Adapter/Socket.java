package com.darshan.designPattern.Adapter;

public class Socket {

  public Volt getVolt() {
    return new Volt(120);
  }
}
