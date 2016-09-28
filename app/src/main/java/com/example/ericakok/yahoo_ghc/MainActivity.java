package com.example.ericakok.yahoo_ghc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new FlurryAgent.Builder()
//                .withLogEnabled
//                .withListener(flurryListener)
//                .build(this, "7Y2M8KJXNB79YT87DYD9");
        setContentView(R.layout.activity_main);
    }
}
