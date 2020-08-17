package com.wzy.behaviour.statemachine;

/**
 * @author wzy
 * @date 2020-08-18 0:17
 **/
public class VideoPlayer implements IPlayer {
    private PlayerState mState = new StopState(this);
    @Override
    public void request(int flag) {
        mState.handle(flag);
    }

    @Override
    public void setState(PlayerState playerState) {
        this.mState = playerState;
    }

    @Override
    public void playVideo() {
        System.out.println("play video");
    }

    @Override
    public void pause() {
        System.out.println("pause video");
    }

    @Override
    public void stop() {
        System.out.println("pause stop");
    }

    @Override
    public void showAd() {

    }

//    @Override
//    public void showAd() {
//
//    }
}
