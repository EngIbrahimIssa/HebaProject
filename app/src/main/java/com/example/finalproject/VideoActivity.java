package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.ZoomControls;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoActivity extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView;
    public  static  String video_id ;
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

                Intent intent = new Intent(VideoActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    /*  String frameVideo = "<html><body><iframe width=\"100%\" height=\"500\" src=\"https://www.youtube.com/embed/WnGhRlj9_E0\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

        WebView webView = (WebView) findViewById(R.id.mWebView);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setLightTouchEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadData(frameVideo, "text/html", "utf-8");

*/

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                // loading the selected video into the YouTube Player
                youTubePlayer.loadVideo(video_id, 0);
            }

            @Override
            public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState state) {
                // this method is called if video has ended,
             /*   youTubePlayer.cueVideo(video_id, 0);
                youTubePlayer.seekTo(0);
                youTubePlayer.pause();
                YouTubePlayerUtils.loadOrCueVideo(
                        youTubePlayer, getLifecycle(),
                        video_id, 0f
                );*/
                super.onStateChange(youTubePlayer, state);
            }


        });


        // This function will be automatically called out,when
        // zoom in button is being pressed

    }

}