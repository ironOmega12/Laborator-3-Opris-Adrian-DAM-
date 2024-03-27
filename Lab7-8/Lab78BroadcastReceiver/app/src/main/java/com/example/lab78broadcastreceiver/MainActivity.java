package com.example.lab78broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startService(new Intent(this, BatteryService.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        stopService(new Intent(this, BatteryService.class));
    }
}
