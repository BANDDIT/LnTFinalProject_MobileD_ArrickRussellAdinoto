package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class CylinderVolume extends Fragment {


    public CylinderVolume() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cylinder_volume, container, false);

        EditText radius_cy = view.findViewById(R.id.radius_et);
        EditText height_cy = view.findViewById(R.id.height_et);

        double radius_cylinder = Double.parseDouble(radius_cy.getText().toString());
        double height_cylinder = Double.parseDouble(height_cy.getText().toString());
        double volume_cylinder = height_cylinder * (3.14) * radius_cylinder *radius_cylinder;

        TextView textview = (TextView) getView().findViewById(R.id.ResultRealCylinder_text);
        textview.setText(String.valueOf(volume_cylinder));


        return view;
    }
}