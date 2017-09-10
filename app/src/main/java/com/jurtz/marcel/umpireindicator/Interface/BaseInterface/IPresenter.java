package com.jurtz.marcel.umpireindicator.Interface.BaseInterface;

import com.jurtz.marcel.umpireindicator.Interface.IUmpIndicatorView;

public interface IPresenter {
    void onCreate(IUmpIndicatorView view);
    void onPause();
    void onResume();
    void onDestroy();
}
