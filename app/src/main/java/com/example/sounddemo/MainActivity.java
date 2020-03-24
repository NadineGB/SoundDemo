package com.example.sounddemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    public void play(View view) {

        mediaPlayer.start();

    }

    public void pause(View view) {

        mediaPlayer.pause();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer = MediaPlayer.create(this, R.raw.thunder);

    }
}
