package com.example.yourubl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText emailEntry, passwordEntry, password2Entry;
    private TextView emailRegisterError, passwordRegisterError, password2RegisterError, loginLink;
    private ImageView registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }
}