package com.example.azaz_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class learnsalah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnsalah);

    }

    public void play(View view)
    {
        VideoView vid =(VideoView)findViewById(R.id.vdoo);
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://fypapp.Entertainmentmoduel.cartoons/"+R.raw.m;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();

    }
}
