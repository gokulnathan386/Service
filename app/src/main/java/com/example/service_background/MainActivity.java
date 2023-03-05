package com.example.service_background;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void servicestart(View view) {

        startService(new Intent(getBaseContext(),MyService.class));
    }

    public void servicestop(View view) {
        stopService(new Intent(getBaseContext(),MyService.class));
    }
}