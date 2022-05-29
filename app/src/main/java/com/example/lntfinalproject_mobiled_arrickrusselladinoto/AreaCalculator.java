package com.example.lntfinalproject_mobiled_arrickrusselladinoto;
import android.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_calculator);

        Button square = findViewById(R.id.SquareArea_btn);
        Button triangle = findViewById(R.id.TriangleArea_btn);
        Button circle= findViewById(R.id.CircleArea_btn);

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_layout,new AreaFragment()).commit();
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_layout,new TriangleArea()).commit();

            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_layout,new CircleArea()).commit();
            }
        });

        //FragmentTransaction add = getSupportFragmentManager().beginTransaction().add(R.id.fragment_layout,new AreaFragment()).commit();//.commit();

       //R.id.fragment_layout new AreaFragment()
    }


}