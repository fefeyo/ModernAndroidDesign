package com.fefe.modernapisample.Modules;

import android.content.Context;

import com.fefe.modernapisample.retrofit.SchoolIdolListApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fefe on 2017/01/15.
 */

@Module
public class AppModule {
    private final Context appContext;
    private final SchoolIdolListApi schoolIdolListApi;

    public AppModule(Context context) {
        this.appContext = context;
        schoolIdolListApi = new Retrofit.Builder()
                .baseUrl("http://schoolido.lu/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SchoolIdolListApi.class);
    }

    @Provides
    @Singleton
    Context provideAppContext() {
        return appContext;
    }

    @Provides
    @Singleton
    SchoolIdolListApi provideSample() {
        return this.schoolIdolListApi;
    }
}
