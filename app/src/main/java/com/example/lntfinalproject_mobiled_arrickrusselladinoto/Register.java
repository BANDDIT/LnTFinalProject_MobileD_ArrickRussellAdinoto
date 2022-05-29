package com.example.lntfinalproject_mobiled_arrickrusselladinoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText bimbelID = findViewById(R.id.bimbelIDBimbel_et);
        EditText email = findViewById(R.id.emailBimbel_et);
        EditText name = findViewById(R.id.nameBimbel_et);
        EditText password = findViewById(R.id.passwordBimbel_et);
        EditText confirm = findViewById(R.id.confirmPasswordBimbel_et);
        Button regis = findViewById(R.id.registerBimbel_btn);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(email.getText().toString().endsWith(".com"))){
                    Snackbar.make(view,"Email harus berakhiran dengan .com",Snackbar.LENGTH_LONG).show();
                }
                else if(!(email.getText().toString().contains("@"))){
                    Snackbar.make(view,"Email harus mengandung karakter @",Snackbar.LENGTH_LONG).show();
                }
                else if((name.getText().toString().length()<5)){
                    Snackbar.make(view,"Nama harus minimal 5 huruf",Snackbar.LENGTH_LONG).show();
                }
                else if(!(confirm.getText().toString().equals(password.getText().toString()))){
                    Snackbar.make(view,"Confirm password tidak sama dengan password",Snackbar.LENGTH_LONG).show();
                }
                else{

                    SharedPreferences sp = getSharedPreferences("data",MODE_PRIVATE);
                    SharedPreferences.Editor edit = sp.edit();

                    edit.putString("Bimbel ID",bimbelID.getText().toString());
                    edit.putString("Email",email.getText().toString());
                    edit.putString("Password",password.getText().toString());
                    edit.apply();


                    Intent intent = new Intent(Register.this,MainActivity.class) ;
                    startActivity(intent);
                }
            }
        });

    }

}