package com.example.servicemanagers;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class NewService extends Service {

    private MediaPlayer media;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        media = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);

        media.setLooping(true);
        media.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        media.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
