package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        Button regis;
        ListView lv;
        ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regis = findViewById(R.id.register);
        lv = findViewById(R.id.studentList);

        names = new ArrayList<>();

        Intent intent = getIntent();
        ArrayList<StudentData> arrayList = (ArrayList<StudentData>) intent.getSerializableExtra("list");


        if (arrayList != null){
            for (int i = 0; i<arrayList.size(); i++){
                names.add(arrayList.get(i).name);
            }
        }


        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,names);
        lv.setAdapter(adapter);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
