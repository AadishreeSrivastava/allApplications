package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splashScreen extends AppCompatActivity {

    TextView gremns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        gremns = findViewById(R.id.gremns);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                gremns.setVisibility(View.VISIBLE);

                Handler h2 = new Handler();
                h2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(splashScreen.this, calci.class);
                        startActivity(i);
                        finish();
                    }
                }, 800);
            }
        }, 1000);

    }
}