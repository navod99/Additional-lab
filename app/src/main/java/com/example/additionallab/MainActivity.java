package com.example.additionallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MediaPlayer player =
//                MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
//        player.setLooping(true);
//        player.start();
    }
    public void Start(View view){
        startService(new Intent(MainActivity.this,MyServices.class));
    }

    public void Stop(View view){
        stopService(new Intent(MainActivity.this,MyServices.class));
    }


}