package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        TextView result = findViewById(R.id.result);
        Button add = findViewById(R.id.add);
        Button minus = findViewById(R.id.minus);
        Button reset = findViewById(R.id.reset);

        SharedPreferences sp = getSharedPreferences("Result",MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(result.getText().toString());
                angka=angka+1;
                result.setText(String.valueOf(angka));
                edit.putString("Jumlah",String.valueOf(angka));
                edit.apply();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(result.getText().toString());
                angka=angka-1;
                result.setText(String.valueOf(angka));
                edit.putString("Jumlah",String.valueOf(angka));
                edit.apply();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(result.getText().toString());
                angka=0;
                result.setText(String.valueOf(angka));
                edit.putString("Jumlah",String.valueOf(angka));
                edit.apply();
            }
        });



    }
}