package com.wzy.behaviour.statemachine;

/**
 * @author wzy
 * @date 2020-08-18 0:11
 **/
public class StopState extends PlayerState {
    public StopState(IPlayer mplayer) {
        super(mplayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PlayerState.PLAY:
            case PlayerState.PAUSE:
                mplayer.playVideo();
                mplayer.setState(new PlayingState(mplayer));
                break;
            case PlayerState.STOP:
                break;
            default:
                throw new IllegalArgumentException("ERROR ACTION:" + action + ",current state");
        }
    }
}
