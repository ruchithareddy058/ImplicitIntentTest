package com.ruchitha.implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MakeACall(View view) {
        Uri u=Uri.parse("tel:9966370675");
        Intent i=new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }

    public void OpenURL(View view) {
        Uri u=Uri.parse("https://www.google.com");
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }

    public void OpenMap(View view) {
        Uri u=Uri.parse("geo:37.7749,-122.4194");
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}