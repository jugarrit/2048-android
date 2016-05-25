package com.uberspot.a2048;

import android.app.Application;

import io.smooch.core.Settings;
import io.smooch.core.Smooch;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Settings settings = new Settings("10rywb2i8bjlqasyfmaqs65xt");
        settings.setServiceHost("smooch-julian.ngrok.io");

        Smooch.init(this, settings);
    }
}
