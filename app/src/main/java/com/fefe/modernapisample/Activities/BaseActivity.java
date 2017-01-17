package com.fefe.modernapisample.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fefe.modernapisample.MainApplication;
import com.fefe.modernapisample.Modules.AppComponent;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject(MainApplication.appComponent());
    }
    protected abstract void inject(AppComponent appComponent);
}
