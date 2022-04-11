package com.vatsal.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Gallery extends AppCompatActivity {
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mp = new MediaPlayer().create(Gallery.this,R.raw.sweety);
        mp.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mp.stop();
    }
}