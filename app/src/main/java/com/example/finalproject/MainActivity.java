package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView bu_menu,bu_letters,ic_about;
    MediaPlayer mySong;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bu_menu = findViewById(R.id.bu_menu);
        ic_about = findViewById(R.id.ic_about);
        bu_letters = findViewById(R.id.bu_letters);
        mySong = MediaPlayer.create(MainActivity.this,R.raw.click);

        ic_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong.start();
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });

        bu_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong.start();
                Intent i = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });

        bu_letters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           /*     mySong.start();
                Intent i = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(i);*/
            }
        });
    }
}