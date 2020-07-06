package com.darshan.design.pattern.strategy;

public class OrkutStrategy implements ISocialMediaStrategy {
  @Override
  public void connectTo(String friendName) {
    System.out.println(friendName + "Connecting through orkut");

  }
}
