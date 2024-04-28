package com.example.a3;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.login_button);
        errorMessageTextView = findViewById(R.id.error_message_text_view);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Check the username and password against a hardcoded list of users
                if (username.equals("admin") && password.equals("password")) {
                    // Login successful, store the login status
                    SharedPreferences preferences = getSharedPreferences("login_preferences", MODE_PRIVATE);
                    preferences.edit().putBoolean("logged_in", true).apply();
                    finish();
                } else {
                    errorMessageTextView.setText("Invalid username or password");
                }
            }
        });
    }
}