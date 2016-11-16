package com.example.daniel.midchallenge_project;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Daniel on 11/15/16.
 */

public interface NetworkComponent {
    @Singleton
    @Component(modules = {AppModule.class, NetworkModule.class})
    interface NetComponent {
        void inject(MainActivity activity);
    }
}
