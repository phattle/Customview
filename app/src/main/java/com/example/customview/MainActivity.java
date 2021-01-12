package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TitleWithIcon mTitleWithIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitleWithIcon = findViewById(R.id.titleWithIcon);
        mTitleWithIcon.setOnClickIcon(new OnListenerClick() {
            @Override
            public void onClickIcon() {
                Toast.makeText(MainActivity.this, "Icon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}