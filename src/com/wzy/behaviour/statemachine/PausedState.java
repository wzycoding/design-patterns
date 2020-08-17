package com.wzy.behaviour.statemachine;

/**
 * @author wzy
 * @date 2020-08-17 23:36
 **/
public class PausedState extends PlayerState {
    public PausedState(IPlayer mplayer) {
        super(mplayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PlayerState.PAUSE:
                break;
            case PlayerState.PLAY:
                mplayer.playVideo();
                mplayer.setState(new PlayingState(mplayer));
                break;
            case PlayerState.STOP:
                mplayer.stop();
                mplayer.setState(new StopState(mplayer));
                break;
            default:
                throw new IllegalArgumentException("ERROR ACTION:" + action + ",current state");
        }
    }
}
