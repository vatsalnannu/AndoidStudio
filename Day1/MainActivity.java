package com.vatsal.day1assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    EditText e1,e2;
    String s1,s2;
    Button b1;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        b1=findViewById(R.id.login);
        ts = new TextToSpeech(MainActivity.this,this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.contentEquals("vatsal") && s2.contentEquals("1234")){
                    ts.speak("Login Successfully done!",TextToSpeech.QUEUE_ADD,null);
                }else{
                    ts.speak("Login Unsuccessful",TextToSpeech.QUEUE_ADD,null);
                }
            }
        });

    }
    @Override
    public void onInit(int i) {
        ts.setLanguage(Locale.ENGLISH);
        ts.setSpeechRate(0.8f);
    }
}