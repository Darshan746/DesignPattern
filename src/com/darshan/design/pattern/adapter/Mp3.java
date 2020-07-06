package com.darshan.design.pattern.adapter;

public class Mp3 implements MediaPlayer {

  @Override
  public void play(String fileName) {

      System.out.println("Playing Mp3:"+fileName);
  }
}
