package com.darshan.design.pattern.strategy;

public class SocialMediaContext {

  ISocialMediaStrategy iSocialMediaStrategy;



  public ISocialMediaStrategy getiSocialMediaStrategy() {
    return iSocialMediaStrategy;
  }

  public void setiSocialMediaStrategy(ISocialMediaStrategy iSocialMediaStrategy) {
    this.iSocialMediaStrategy = iSocialMediaStrategy;
  }
}
