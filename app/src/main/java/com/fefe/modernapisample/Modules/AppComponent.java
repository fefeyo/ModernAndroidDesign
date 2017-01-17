package com.fefe.modernapisample.Modules;

import com.fefe.modernapisample.Activities.MainActivity;
import com.fefe.modernapisample.Fragments.MainFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fefe on 2017/01/15.
 */

@Singleton
@Component(modules = {
        AppModule.class
})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(MainFragment mainFragment);
}
