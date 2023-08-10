package com.example.firework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.plattysoft.leonids.ParticleSystem;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        new ParticleSystem(this, 1000, R.drawable.firwork, 1000)
                .setSpeedModuleAndAngleRange(0.05f, 0.2f, 0, 360)
                .setRotationSpeed(30)
                .setAcceleration(0, 90)
                .oneShot(view, 200);
    }
}