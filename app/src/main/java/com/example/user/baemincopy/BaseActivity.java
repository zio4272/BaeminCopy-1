package com.example.user.baemincopy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 2017-08-21.
 */

public abstract class BaseActivity extends AppCompatActivity{

    Context mContext = this;

    public abstract void BindViews();
    public abstract void SetUpEvents();
    public abstract void SetValues();

}
