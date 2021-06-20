package com.example.azaz_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainActivityi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityi);
    }

    public void boy(View view)
    {

        Intent namaz = new Intent(getApplicationContext(),homepage.class);
        startActivity(namaz);
    }

    public void girl(View view) {
    }
}
