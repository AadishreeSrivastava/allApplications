package com.example.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name, pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        btn = findViewById(R.id.logBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if((name.getText().toString().equals("Aadi"))&&(pass.getText().toString().equals("1234"))){
                    Intent i2 = new Intent(MainActivity.this, loggedIn.class);
                    startActivity(i2);
                    finish();
                }
                else if((name.getText().toString().equals(""))||(pass.getText().toString().equals(""))){
                    Toast.makeText(MainActivity.this, "Please fill all the details.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Incorrect details entered", Toast.LENGTH_SHORT).show();
                }
                }
        });

    }
}