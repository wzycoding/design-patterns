package com.wzy.structural.adapter;

/**
 * description: AdapterPatternDemo <br>
 * date: 2020-06-09 17:37 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "兄弟抱一下.mp3");
        audioPlayer.play("mp4", "兄弟抱一下.mp4");
        audioPlayer.play("vlc", "兄弟抱一下.vlc");
        audioPlayer.play("avi", "兄弟抱一下.avi");
    }
}
