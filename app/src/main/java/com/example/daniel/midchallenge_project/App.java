package com.example.daniel.midchallenge_project;

import android.app.Application;

/**
 * Created by Daniel on 11/15/16.
 */

public class App extends Application {

    private NetworkComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetworkModule(" https://api.airbnb.com/v2/search_results"))
                .build();
    }

    public NetworkComponent getNetComponent() {
        return mNetComponent;
    }
}
