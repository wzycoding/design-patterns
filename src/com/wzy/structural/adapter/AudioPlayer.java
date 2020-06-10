package com.wzy.structural.adapter;

/**
 * description: AudioPlayer <br>
 * date: 2020-06-09 17:21 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaPlayer;
    @Override
    public void play(String audioType, String fileName) {
        // 播放mp3音乐文件内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
            || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
