package com.darshan.design.pattern.strategy;

public class GoogleStrategy implements ISocialMediaStrategy {

  @Override
  public void connectTo(String friendName){
    System.out.println(friendName +"Connecting through Google");


  }
}
