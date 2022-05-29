package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class PyramidVolume extends Fragment {



    public PyramidVolume() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pyramid_volume, container, false);

        EditText side_py = view.findViewById(R.id.sidePy_et);
        EditText height_py = view.findViewById(R.id.heightPy_et);

        double side_pyramid = Double.parseDouble(side_py.getText().toString());
        double height_pyramid = Double.parseDouble(height_py.getText().toString());
        double volume_pyramid =  (1/3) * side_pyramid * side_pyramid * height_pyramid;

        TextView textview = (TextView) getView().findViewById(R.id.ResultRealPyramid_text);
        textview.setText(String.valueOf(volume_pyramid));

        return view;
    }
}