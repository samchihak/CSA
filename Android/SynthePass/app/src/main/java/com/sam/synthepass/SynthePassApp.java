package com.sam.synthepass;

import android.app.Application;

import com.backendless.Backendless;

public class SynthePassApp extends Application {

    public static final String APPLICATION_ID="9517E858-B276-A825-FF32-077F0F6E7600";
    public static final String API_KEY="0C1E2B47-665A-F95E-FF44-AA7B9D541800";
    public static final String SERVER_URL="https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID, API_KEY);

    }
}
