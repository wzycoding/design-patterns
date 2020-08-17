package com.wzy.behaviour.statemachine;

/**
 * 播放状态类
 * @author wzy
 * @date 2020-08-17 23:33
 **/
public class PlayingState extends PlayerState {
    public PlayingState(IPlayer mplayer) {
        super(mplayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PlayingState.PLAY:
                break;
            case PlayingState.PAUSE:
                mplayer.pause();
                mplayer.setState(new PausedState(mplayer));
                break;
            case PlayingState.STOP:
                mplayer.stop();
                mplayer.setState(new StopState(mplayer));
                break;
            default:
                throw new IllegalArgumentException("ERROR ACTION:" + action + ",current state");
        }
    }
}
