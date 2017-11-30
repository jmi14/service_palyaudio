package com.example.hpfolio.serviceapplication;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;


public class MainActivity extends Service {

    MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();

        mediaPlayer = MediaPlayer.create(this, R.raw.sun);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        mediaPlayer.stop();

    }

}
