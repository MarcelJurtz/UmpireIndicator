package com.jurtz.marcel.umpireindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jurtz.marcel.umpireindicator.Interface.IUmpIndicatorPresenter;
import com.jurtz.marcel.umpireindicator.Interface.IUmpIndicatorView;
import com.jurtz.marcel.umpireindicator.Interface.UmpIndicatorPresenter;

public class MainActivity extends AppCompatActivity implements IUmpIndicatorView {

    TextView txtBalls;
    TextView txtStrikes;
    TextView txtOuts;
    TextView txtInnings;

    IUmpIndicatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBalls = (TextView)findViewById(R.id.txtBalls);
        txtStrikes = (TextView)findViewById(R.id.txtStrikes);
        txtOuts = (TextView)findViewById(R.id.txtOuts);
        txtInnings = (TextView)findViewById(R.id.txtInnings);

        presenter = new UmpIndicatorPresenter();
        presenter.onCreate(this);

        //region TextView onClickListeners
        txtBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onBallClick();
            }
        });

        txtStrikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onStrikeClick();
            }
        });

        txtOuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onOutClick();
            }
        });

        txtInnings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onInningClick();
            }
        });
        //endregion
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        presenter.onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void setBallText(String text) {
        txtBalls.setText(text);
    }

    @Override
    public void setStrikeText(String text) {
        txtStrikes.setText(text);
    }

    @Override
    public void setOutText(String text) {
        txtOuts.setText(text);
    }

    @Override
    public void setInningText(String text) {
        txtInnings.setText(text);
    }
}
