package com.example.azaz_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void namaz(View view)
    {

        Intent namaz = new Intent(getApplicationContext(),learnsalah.class);
        startActivity(namaz);
    }
}
