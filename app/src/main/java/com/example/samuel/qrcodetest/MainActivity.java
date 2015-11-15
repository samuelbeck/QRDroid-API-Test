package com.example.samuel.qrcodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendIntent(View view ) {
        Intent qrDroid = new Intent("la.droid.qr.scan");
        startActivityForResult(qrDroid, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String result = data.getExtras().getString("la.droid.qr.result");
        Intent intent = new Intent(this, TextReceiver.class);
        intent.putExtra("QRText", result);
        startActivity(intent);

    }
}
