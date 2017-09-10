package com.jurtz.marcel.umpireindicator.Interface;

import com.jurtz.marcel.umpireindicator.Game;

public class UmpIndicatorPresenter implements IUmpIndicatorPresenter {

    Game game;
    IUmpIndicatorView view;

    //region Activity Lifecycle Methods
    @Override
    public void onCreate(IUmpIndicatorView view) {
        game = new Game();
        this.view = view;

        view.setBallText(String.valueOf(game.getBalls()));
        view.setStrikeText(String.valueOf(game.getStrikes()));
        view.setOutText(String.valueOf(game.getOuts()));
        view.setInningText(String.valueOf(game.getInning()));
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
    //endregion

    //region View Click Handlind
    @Override
    public void onBallClick() {
        game.increaseBalls();
        view.setBallText(String.valueOf(game.getBalls()));
    }

    @Override
    public void onStrikeClick() {
        game.increaseStrikes();
        view.setStrikeText(String.valueOf(game.getStrikes()));
    }

    @Override
    public void onOutClick() {
        game.increaseOuts();
        view.setOutText(String.valueOf(game.getOuts()));
    }

    @Override
    public void onInningClick() {
        game.increaseInnings();
        view.setInningText(String.valueOf(game.getInning()));
    }
    //endregion
}
