package com.example.lab78broadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.IBinder;
import android.widget.Toast;

public class BatteryService extends Service {

    private BatteryReceiver batteryReceiver;

    @Override
    public void onCreate() {
        super.onCreate();


        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        batteryReceiver = new BatteryReceiver();
        registerReceiver(batteryReceiver, intentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();


        unregisterReceiver(batteryReceiver);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
