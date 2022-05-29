package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class AreaFragment extends Fragment {

    public AreaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);

        EditText side = view.findViewById(R.id.side_et);

        double angka= Double.parseDouble(side.getText().toString());
        double luas = angka*angka;

        TextView textview = (TextView) getView().findViewById(R.id.ResultReal_text);
        textview.setText(String.valueOf(luas));
        return view;
    }
}

