package com.wzy.structural.adapter;

/**
 * description: Mp4Player <br>
 * date: 2020-06-09 16:51 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 不做任何操作
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
