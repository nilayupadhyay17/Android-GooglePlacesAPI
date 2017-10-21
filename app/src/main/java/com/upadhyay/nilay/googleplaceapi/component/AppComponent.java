package com.upadhyay.nilay.googleplaceapi.component;

import com.upadhyay.nilay.googleplaceapi.MainActivity;
import com.upadhyay.nilay.googleplaceapi.networking.NetModule;

import dagger.Component;

/**
 * Created by nilay on 10/19/2017.
 */
@Component(modules = NetModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
