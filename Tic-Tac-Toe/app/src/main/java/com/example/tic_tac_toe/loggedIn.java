package com.example.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_logged_in);

        getSupportActionBar().hide();

        Handler h3 = new Handler();
        h3.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i3 = new Intent(loggedIn.this,piece_selection.class);
                startActivity(i3);
                finish();
            }
        }, 1000);

    }
}