package com.jurtz.marcel.umpireindicator.Interface;

import com.jurtz.marcel.umpireindicator.Interface.BaseInterface.IPresenter;
import com.jurtz.marcel.umpireindicator.Interface.BaseInterface.IView;

public interface IUmpIndicatorPresenter extends IPresenter {
    void onBallClick();
    void onStrikeClick();
    void onOutClick();
    void onInningClick();
}
