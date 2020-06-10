package com.wzy.structural.adapter;

/**
 * description: VlcPlayer <br>
 * date: 2020-06-09 16:50 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 不做其他操作
    }
}
