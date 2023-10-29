package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView MiVideo = findViewById(R.id.Video);
        String mvideo = "android.resource://"+getPackageName()+"/"+R.raw.fnaf;
        Uri uri = Uri.parse(mvideo);
        MiVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideo.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideo);
    }
}