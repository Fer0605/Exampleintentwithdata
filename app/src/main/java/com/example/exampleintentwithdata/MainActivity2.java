package com.example.exampleintentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView)findViewById(R.id.textView);
        String data = getIntent().getStringExtra("data");
        textView.setText(data + " SIUUUUUUUUUUU");
    }
    public void Return(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}