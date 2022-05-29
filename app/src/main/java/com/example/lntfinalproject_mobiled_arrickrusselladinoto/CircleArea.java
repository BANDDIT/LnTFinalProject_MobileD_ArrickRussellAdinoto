package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class CircleArea extends Fragment {

    public CircleArea() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle_area, container, false);

        EditText radius_cr = view.findViewById(R.id.radius_et);
        double radius_r = Double.parseDouble(radius_cr.getText().toString());
        double luas = 3.14*radius_r*radius_r;

        TextView textview = (TextView) getView().findViewById(R.id.ResultRealCircle_text);
        textview.setText(String.valueOf(luas));


        return view;
    }
}