package com.upadhyay.nilay.googleplaceapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Inject
    Retrofit retrofit;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((PlaceSearchApplication) getApplication()).getAppComponent().inject(this);


        // ne
        retrofit.create(PlaceSearchService.class);

        //textView = (TextView) findViewById();
        //Call<List<search>>
    }
}
