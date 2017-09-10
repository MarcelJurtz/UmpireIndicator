package com.jurtz.marcel.umpireindicator.Interface;

import com.jurtz.marcel.umpireindicator.Interface.BaseInterface.IView;

public interface IUmpIndicatorView extends IView {
    void setBallText(String text);
    void setStrikeText(String text);
    void setOutText(String text);
    void setInningText(String text);
}
