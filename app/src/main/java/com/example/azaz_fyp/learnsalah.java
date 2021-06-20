package com.example.azaz_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import cn.pedant.SweetAlert.SweetAlertDialog;

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

    public void quiz(View view)
    {
        new SweetAlertDialog(learnsalah.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want play Game")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Toast.makeText(learnsalah.this, "Quiz activity ", Toast.LENGTH_SHORT).show();

                    }
                })
                .setCancelText("No")
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();

                    }
                })
                .show();
    }
}
