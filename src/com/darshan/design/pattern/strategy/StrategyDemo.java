package com.darshan.design.pattern.strategy;

public class StrategyDemo {

  public static void main(String[] args) {
    SocialMediaContext context = new SocialMediaContext();
    context.setiSocialMediaStrategy(new FacebookStrategy());
    context.getiSocialMediaStrategy().connectTo("Darshan");
  }


}
