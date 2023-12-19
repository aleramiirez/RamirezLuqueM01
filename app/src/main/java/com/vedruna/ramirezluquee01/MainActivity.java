package com.vedruna.ramirezluquee01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String userName = getIntent().getStringExtra("userName");

        TextView textViewUsuario = findViewById(R.id.byUserText);
        textViewUsuario.setText("Bienvenido, " + userName);
    }
}