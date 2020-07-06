package com.darshan.design.pattern.adapter;

public class AdapterClientDemo {

  public static void main(String[] args) {

    MediaPlayer mediaPlayer = new Mp3();
    mediaPlayer.play("AudioSong");


    MediaPlayer adapter = new Mp4Adapter(new Mp4());
    adapter.play("VideoSong");
  }
}
