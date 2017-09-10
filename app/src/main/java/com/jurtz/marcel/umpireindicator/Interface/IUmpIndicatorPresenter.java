package com.jurtz.marcel.umpireindicator.Interface;

public interface IUmpIndicatorPresenter {
    void onCreate(IUmpIndicatorView view);
    void onPause();
    void onResume();
    void onDestroy();

    void onBallClick();
    void onStrikeClick();
    void onOutClick();
    void onInningClick();
}
