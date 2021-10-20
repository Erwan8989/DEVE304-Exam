package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class Activity2 extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        Log.e("DEVE0304", "Activity2:onCreate()");

        //LinkedList<String> list = (LinkedList<String>) getIntent().getSerializableExtra("string_list");

        Intent intent = getIntent();


        //textview.setText(intent);
    }


}