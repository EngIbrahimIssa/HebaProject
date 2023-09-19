package com.example.finalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoLettersActivity extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView;
    String video_id = "WiEUR4_Ytu0";
    ImageView ic_back,ic_fullScreen,ic_stopFull;

    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        ic_back = findViewById(R.id.ic_back);
        ic_fullScreen = findViewById(R.id.ic_fullScreen);
        ic_stopFull = findViewById(R.id.ic_stopFull);
        youTubePlayerView = findViewById(R.id.videoPlayer);


        ic_fullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                ic_stopFull.setVisibility(View.VISIBLE);
                ic_fullScreen.setVisibility(View.GONE);
            }
        });

        ic_stopFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                ic_stopFull.setVisibility(View.GONE);
                ic_fullScreen.setVisibility(View.VISIBLE);
            }
        });
        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(VideoLettersActivity.this, MainActivity.class);
                    startActivity(intent);

            }
        });


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                // loading the selected video into the YouTube Player
                youTubePlayer.loadVideo(video_id, 0);
            }

            @Override
            public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState state) {
                // this method is called if video has ended,

                super.onStateChange(youTubePlayer, state);
            }


        });




    }

    @Override
    public void onBackPressed() {
    }

}