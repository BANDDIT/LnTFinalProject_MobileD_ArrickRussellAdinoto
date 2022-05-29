
package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class TriangleArea extends Fragment {


    public TriangleArea() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_triangle_area, container, false);

        EditText base_tr = view.findViewById(R.id.base_et);
        EditText height_tr = view.findViewById(R.id.height_et);

        double base = Double.parseDouble(base_tr.getText().toString());
        double height = Double.parseDouble(height_tr.getText().toString());
        double luas = base*height/2;

        TextView textview = (TextView) getView().findViewById(R.id.ResultRealTriangle_text);
        textview.setText(String.valueOf(luas));
        return view;
    }
}