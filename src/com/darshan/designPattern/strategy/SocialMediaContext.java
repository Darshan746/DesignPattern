package com.darshan.designPattern.strategy;

public class SocialMediaContext {

  ISocialMediaStrategy iSocialMediaStrategy;



  public ISocialMediaStrategy getiSocialMediaStrategy() {
    return iSocialMediaStrategy;
  }

  public void setiSocialMediaStrategy(ISocialMediaStrategy iSocialMediaStrategy) {
    this.iSocialMediaStrategy = iSocialMediaStrategy;
  }
}
