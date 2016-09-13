package com.example.hernan_fiuba.myapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Check if we're running on Android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Call some material design APIs here

        } else {
            // Implement this feature without material design

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }
}
