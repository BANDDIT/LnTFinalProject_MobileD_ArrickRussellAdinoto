package com.example
        .lntfinalproject_mobiled_arrickrusselladinoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstaneState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstaneState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.email_et);
        EditText password = findViewById(R.id.password_et);
        Button login = findViewById(R.id.login_btn);
        Button regis = findViewById(R.id.register_btn);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(email.getText().toString().endsWith(".com"))){
                    Snackbar.make(view,"Email harus berakhiran dengan .com",Snackbar.LENGTH_LONG).show();
                }
                else if(!(email.getText().toString().contains("@"))){
                    Snackbar.make(view,"Email harus mengandung karakter @",Snackbar.LENGTH_LONG).show();
                }
                else if(!(email.getText().toString().equals(sp.getString("Email","")))){
                    Snackbar.make(view,"Email tidak tepat",Snackbar.LENGTH_LONG).show();
                }
                else if(!(password.getText().toString().equals(sp.getString("Password","")))){
                    Snackbar.make(view,"Password tidak tepat",Snackbar.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,AreaCalculator.class);
                    startActivity(intent);
                }
            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Menu.class) ;
                startActivity(intent);
            }
        });
    }
}