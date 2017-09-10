package com.jurtz.marcel.umpireindicator;

public class Game {
    private int balls;
    private int strikes;
    private int outs;
    private int inning;

    private final int BALLS_MIN = 0;
    private final int BALLS_MAX = 3;

    private final int STRIKES_MIN = 0;
    private final int STRIKES_MAX = 2;

    private final int OUTS_MIN = 0;
    private final int OUTS_MAX = 2;

    private final int INNINGS_MIN = 1;
    private final int INNINGS_MAX = 9;

    public Game() {
        balls = BALLS_MIN;
        strikes = STRIKES_MIN;
        outs = OUTS_MIN;
        inning = INNINGS_MIN;
    }

    //region Getter
    public int getBalls() {
        return balls;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getOuts() {
        return outs;
    }

    public int getInning() {
        return inning;
    }
    //endregion

    //region Increase Values
    public void increaseBalls() {
        balls++;
        if(balls > BALLS_MAX) balls = BALLS_MIN;
    }

    public void increaseStrikes() {
        strikes++;
        if(strikes > STRIKES_MAX) strikes = STRIKES_MIN;
    }

    public void increaseOuts() {
        outs++;
        if(outs > OUTS_MAX) outs = OUTS_MIN;
    }

    public void increaseInnings() {
        inning++;
        if(inning > INNINGS_MAX) inning = INNINGS_MIN;
    }
    //endregion
}
