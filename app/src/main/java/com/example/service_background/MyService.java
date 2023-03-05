package com.example.service_background;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "SERVICE STRAT ", Toast.LENGTH_SHORT).show();

        //return super.onStartCommand(intent, flags, startId);
    return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "SERVICE STOP", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}