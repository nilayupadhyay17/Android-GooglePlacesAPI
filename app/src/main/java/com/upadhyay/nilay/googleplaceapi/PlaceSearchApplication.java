package com.upadhyay.nilay.googleplaceapi;

import android.app.Application;

import com.upadhyay.nilay.googleplaceapi.component.AppComponent;
import com.upadhyay.nilay.googleplaceapi.component.DaggerAppComponent;
import com.upadhyay.nilay.googleplaceapi.networking.NetModule;

import javax.inject.Inject;

/**
 * Created by nilay on 10/20/2017.
 */

public class PlaceSearchApplication extends Application {
    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().netModule(new NetModule("https://maps.googleapis.com/maps/api/place/nearbysearch/")).build();

    }
    public AppComponent getAppComponent(){
        return appComponent;
    }
}
