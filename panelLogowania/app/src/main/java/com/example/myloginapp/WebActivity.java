package com.example.myloginapp;

import static com.example.myloginapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_web);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_web);
        String url = getIntent().getStringExtra("pdf_url");
        WebView webView = findViewById(id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);
    }
}