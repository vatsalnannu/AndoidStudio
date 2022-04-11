package com.vatsal.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class ContactUs extends AppCompatActivity {
Button b1,b2;
MediaPlayer mp,mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        mp =new MediaPlayer().create(ContactUs.this,R.raw.supermario);
        mp1 = new MediaPlayer().create(ContactUs.this,R.raw.gnim);
        b1=findViewById(R.id.song1btn);
        b2=findViewById(R.id.song2btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.isPressed()) {
                    if(mp.isPlaying()){
                        b1.setText("Play");
                        mp.pause();

                    }else{
                        mp.start();
                        if(mp1.isPlaying())
                        {mp1.pause();}
                        b1.setText("Pause");
                        b2.setText("Play");
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.isPressed()) {
                    if(mp1.isPlaying()){
                        b2.setText("Play");
                        mp1.pause();

                    }else{
                        mp1.start();
                        mp.pause();
                        b2.setText("Pause");
                        b1.setText("Play");

                    }
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        mp.stop();
        mp1.stop();
    }
}