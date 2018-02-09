package com.example.student.a2018010303;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    wv=(WebView)findViewById(R.id.webview);
    wv.setWebChromeClient(new WebChromeClient());
    wv.getSettings().setJavaScriptEnabled(true);
    wv.loadUrl("file:///android_asset/index.html");
    }
}
