package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class CuboidVolume extends Fragment {


    public CuboidVolume() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cuboid_volume, container, false);

        EditText widthCu = view.findViewById(R.id.WidthCu_et);
        EditText lengthCu = view.findViewById(R.id.LengthCu_et);
        EditText heightCu = view.findViewById(R.id.HeightCu_et);

        double widthCuboid =  Double.parseDouble(widthCu.getText().toString());
        double lengthCuboid =  Double.parseDouble(lengthCu.getText().toString());
        double heightCuboid =  Double.parseDouble(heightCu.getText().toString());
        double volumeCuboid = widthCuboid * lengthCuboid * heightCuboid;

        TextView textview = (TextView) getView().findViewById(R.id.ResultRealCuboid_text);
        textview.setText(String.valueOf(volumeCuboid));

        return view;
    }
}