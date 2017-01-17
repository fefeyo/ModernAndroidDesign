package com.fefe.modernapisample;

import android.app.Application;
import android.content.Context;

import com.fefe.modernapisample.Modules.AppComponent;
import com.fefe.modernapisample.Modules.AppModule;
import com.fefe.modernapisample.Modules.DaggerAppComponent;

/**
 * Created by fefe on 2017/01/15.
 */

public class MainApplication extends Application{
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }

    public static AppComponent appComponent() {
        return appComponent;
    }
}
