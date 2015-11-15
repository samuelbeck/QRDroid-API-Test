package com.example.samuel.qrcodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextReceiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String result = intent.getStringExtra("QRText");

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(result);
        setContentView(textView);
    }
}
