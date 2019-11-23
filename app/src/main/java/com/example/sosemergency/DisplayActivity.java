package com.example.sosemergency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    double longitude,latitude;
    private TextView cord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle bundle = getIntent().getExtras();
        longitude = bundle.getDouble("long");
        latitude = bundle.getDouble("lat");
        cord = findViewById(R.id.txtv_cord);
        cord.setText(longitude+"  "+latitude);
    }
}
