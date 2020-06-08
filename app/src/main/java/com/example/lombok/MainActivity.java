package com.example.lombok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private UrlData urlData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        urlData = new UrlData(R.id.text, "Hello Lombok");
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.text);
        tv.setText(urlData.url());
    }
}