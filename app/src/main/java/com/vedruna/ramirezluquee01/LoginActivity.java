package com.vedruna.ramirezluquee01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText userInput;
    private EditText passwordInput;
    private TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userInput = findViewById(R.id.UserInput);
        passwordInput = findViewById(R.id.PasswordInput);
        messageText = findViewById(R.id.messageText);
    }

    public void login(View view){
        String user = userInput.getText().toString();
        String password = passwordInput.getText().toString();

        if (user.equals("alejandro") && password.equals("admin")){
            String username = user;
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("userName", username);
            startActivity(intent);
        } else {
            messageText.setText("Usuario o contraseña incorrecta");
        }
    }
}