package com.kariot.loginsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    TextView myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        myData = findViewById(R.id.textView);
        myData.setText("Username is :" + getIntent().getStringExtra("UNAME") + "\n" +
                "Password is : " + getIntent().getStringExtra("PWORD"));
        Log.e("USERNAME IS", getIntent().getStringExtra("UNAME"));
    }
}