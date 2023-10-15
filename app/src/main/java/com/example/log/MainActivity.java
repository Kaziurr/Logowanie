package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Login;
    private TextView Pass;
    private Button b1;
    private TextView tv;
    String has ="KaziuRR";



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.editTextText);
        Pass = findViewById(R.id.editTextTextPassword);
        b1 = findViewById(R.id.button);
        tv = findViewById(R.id.pokaz);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pp= Pass.getText().toString();
                String ll = Login.getText().toString();

                if(pp.equals(has)){
                    tv.setText("Login: " +ll);
                } else {
                    tv.setText("");
                }
            }
        });


    }
}