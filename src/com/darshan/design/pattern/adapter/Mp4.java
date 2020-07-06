package com.darshan.design.pattern.adapter;

public class Mp4 implements MediaPackage {

  @Override
  public void playFile(String fileName){
    System.out.println("Playing MP4:"+fileName);
  }

}
