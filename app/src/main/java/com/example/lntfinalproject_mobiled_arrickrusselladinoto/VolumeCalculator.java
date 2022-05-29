package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolumeCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_calculator);

        Button pyramid = findViewById(R.id.PyramidVolume);
        Button cuboid = findViewById(R.id.CuboidVolume);
        Button cylinder = findViewById(R.id.CylinderVolume);

        pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_volume, new PyramidVolume()).commit();
            }
        });

        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_volume, new CuboidVolume()).commit();
            }
        });

        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_volume, new CylinderVolume()).commit();
            }
        });

    }
}