package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class showdata extends AppCompatActivity {

  TextView name,id,email;
    Button ok;
    StudentData studentData;

    static ArrayList<StudentData> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        name = findViewById(R.id.nameshow);
        id= findViewById(R.id.idshow);
        email = findViewById(R.id.emailshow);
        ok = findViewById(R.id.back);

        final Intent intent = getIntent();
        studentData = (StudentData) intent.getSerializableExtra("model");

        name.setText(studentData.name);
        id.setText(studentData.id);
        email.setText(studentData.email);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                arrayList.add(studentData);

                Intent intent1 = new Intent(showdata.this, MainActivity.class);
                intent1.putExtra("list",arrayList);
                intent1.addFlags(intent1.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent1);

            }
        });


    }
}
