package com.example.finalproject;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class draftdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draftdata);
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        EditText mood = findViewById(R.id.mood);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        textView1.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);

    }
    private void storedata(){
        //if(height.)
    }
}
