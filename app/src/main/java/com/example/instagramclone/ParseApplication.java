package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("flS4FuVEpnDMxKMz4VJ9y66fA8kT8bnJUMVB48kL")
                .clientKey("h2fp7lO0vnjgOSYnHVluXLAfbksWcQDw5XyAB6D8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
