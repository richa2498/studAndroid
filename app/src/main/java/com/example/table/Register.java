package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Register extends AppCompatActivity {

    EditText nameS;
    EditText emailS;
    EditText id;
    Button submits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameS = findViewById(R.id.name);
        emailS = findViewById(R.id.email);
        id = findViewById(R.id.studid);
        submits = findViewById(R.id.submit);

        submits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StudentData sd = new StudentData(nameS.getText().toString(),emailS.getText().toString(),id.getText().toString());
                Intent intent = new Intent(Register.this,showdata.class);
                intent.putExtra("model",sd);
                startActivity(intent);

            }
        });

    }




}
