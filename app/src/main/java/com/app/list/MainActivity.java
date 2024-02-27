package com.app.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd=findViewById(R.id.buttonAdd);

        EditText textViewName=findViewById(R.id.editTextName);
        EditText textViewEmail=findViewById(R.id.editTextEmail);
        ListView listView=findViewById(R.id.listView);

        List<String> emails =new ArrayList<String>();
        ArrayAdapter adaper=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,emails);
        listView.setAdapter(adaper);
        
        buttonAdd.setOnClickListener(view -> {
            Log.d("onCreate", "onCreate: lunch ");
            Toast.makeText(this, "toasting", Toast.LENGTH_SHORT).show();
            String name=textViewName.getText().toString();
            String email=textViewEmail.getText().toString();
            emails.add("name:"+name+"\n"+"Email:"+email);
            adaper.notifyDataSetChanged();

        });

    }
}