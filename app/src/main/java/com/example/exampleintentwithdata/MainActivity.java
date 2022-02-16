package com.example.exampleintentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName);
    }
    public void Send(View view){
        Intent i =new Intent(this, MainActivity2.class);
        i.putExtra("data",editTextTextPersonName.getText().toString());
        startActivity(i);
    }
}