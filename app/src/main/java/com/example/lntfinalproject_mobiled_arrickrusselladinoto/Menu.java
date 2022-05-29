package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button area = findViewById(R.id.area_et);
        Button volume = findViewById(R.id.volume_et);
        Button counter = findViewById(R.id.counter_et);

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,AreaCalculator.class) ;
                startActivity(intent);
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,VolumeCalculator.class) ;
                startActivity(intent);
            }
        });
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,Counter.class) ;
                startActivity(intent);
            }
        });


    }
}