package com.wzy.behaviour.statemachine;

/**
 * @author wzy
 * @date 2020-08-17 23:23
 **/
public abstract class PlayerState {
    public static final int PLAY = 0;
    public static final int PAUSE = 1;
    public static final int STOP = 2;

    protected IPlayer mplayer;

    public PlayerState(IPlayer mplayer) {
        this.mplayer = mplayer;
    }

    public abstract void handle(int action);

    @Override
    public String toString() {
        return "current state:" + this.getClass().getSimpleName();
    }
}
