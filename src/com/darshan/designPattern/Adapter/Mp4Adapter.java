package com.darshan.designPattern.Adapter;

//Target should be implemented
//adaptee should have object reference (has a relation) EX: MediaPackage
public class Mp4Adapter implements MediaPlayer {

  MediaPackage mediaPackage;

  Mp4Adapter(MediaPackage mediaPackage){
    this.mediaPackage = mediaPackage;
  }


  @Override
  public void play(String fileName) {
    mediaPackage.playFile(fileName);
  }
}
