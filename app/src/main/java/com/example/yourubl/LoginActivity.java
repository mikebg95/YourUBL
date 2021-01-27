package com.example.yourubl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEntry, passwordEntry;
    private TextView forgotPassword, registerLink, emailErrorLogin, passwordErrorLogin;
    private ImageView loginBtn;

    private boolean clicked, emailExited, passwordExited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // views
        emailEntry = findViewById(R.id.email_edittext);
        passwordEntry = findViewById(R.id.password_edittext);
        forgotPassword = findViewById(R.id.forgot_password);
        registerLink = findViewById(R.id.register_link);
        loginBtn = findViewById(R.id.login_btn);
        emailErrorLogin = findViewById(R.id.email_error_login);
        passwordErrorLogin = findViewById(R.id.password_error_login);

        clicked = false;

        // forgot password clicked
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ForgotPasswordActivity.class));
            }
        });

        // register link clicked
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });

        emailEntry.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (clicked || emailExited) {
                    String email = emailEntry.getText().toString().trim();
                    if (TextUtils.isEmpty(email)) {
                        emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        emailEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                        emailErrorLogin.setText("Email address is required");
                    } else {
                        emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check_circle, 0);
                        emailErrorLogin.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        emailEntry.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!clicked) {
                    String email = emailEntry.getText().toString().trim();
                    if (!hasFocus) {
                        emailExited = true;

                        if (TextUtils.isEmpty(email)) {
                            emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            emailEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                            emailErrorLogin.setText("Email address is required");
                        } else {
                            emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check_circle, 0);
                            emailErrorLogin.setText("");
                        }
                    }
                }
            }
        });

        passwordEntry.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (clicked || passwordExited) {
                    String password = passwordEntry.getText().toString().trim();
                    if (TextUtils.isEmpty(password)) {
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        passwordEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                        passwordErrorLogin.setText("Password is required");
                    } else {
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check_circle, 0);
                        passwordErrorLogin.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        passwordEntry.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!clicked) {
                    String password = passwordEntry.getText().toString().trim();

                    if (!hasFocus) {
                        passwordExited = true;
                    }

                    if (TextUtils.isEmpty(password)) {
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        passwordEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                        passwordErrorLogin.setText("Password is required");
                    } else {
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check_circle, 0);
                        passwordErrorLogin.setText("");
                    }
                }
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                clicked = true;
                boolean ready = true;

                String email = emailEntry.getText().toString().trim();
                String password = passwordEntry.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    emailEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    emailEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                    emailErrorLogin.setText("Email address is required");
                    ready = false;
                }

                if (TextUtils.isEmpty(password)) {
                    passwordEntry.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    passwordEntry.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.error_circle, 0);
                    passwordErrorLogin.setText("Password is required");
                    ready = false;
                }

                if (ready) {
                    startActivity(new Intent(getApplicationContext(), HomeScreenActivity.class));
                }
            }
        });

    }
}