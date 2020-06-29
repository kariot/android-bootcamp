package com.kariot.blogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsDetailsActivity extends AppCompatActivity {
    WebView newsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        newsWebView = findViewById(R.id.newsWebView);
        String URL = getIntent().getStringExtra("URL");
        newsWebView.getSettings().setJavaScriptEnabled(true);
        newsWebView.setWebViewClient(new WebViewClient());
        newsWebView.loadUrl(URL);
    }
}