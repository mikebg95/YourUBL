package com.example.yourubl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView googleIcon, fbIcon, linkedinIcon, appleIcon, microsoftIcon, loginBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // views
        googleIcon = findViewById(R.id.google_icon);
        fbIcon = findViewById(R.id.fb_icon);
        linkedinIcon = findViewById(R.id.linkedin_icon);
        appleIcon = findViewById(R.id.apple_icon);
        microsoftIcon = findViewById(R.id.microsoft_icon);
        loginBtn = findViewById(R.id.login_btn);
        registerBtn = findViewById(R.id.register_btn);

        // when clicked on login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

        // when clicked on register button
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });

        // google icon click
        googleIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                // google login
            }
        });

        // fb login click
        fbIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                // fb login
            }
        });

        // linkedin login click
        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                // linkedin login
            }
        });

        // apple login click
        appleIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                // apple icon
            }
        });

        // microsoft login click
        microsoftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));
                // microsoft icon
            }
        });
    }
}