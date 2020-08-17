package com.wzy.behaviour.statemachine;

/**
 * 播放器上下文
 * @author wzy
 * @date 2020-08-17 23:22
 **/
public interface IPlayer {
    void request(int flag);

    void setState(PlayerState playerState);

    void playVideo();

    void pause();

    void stop();

    void showAd();
}
