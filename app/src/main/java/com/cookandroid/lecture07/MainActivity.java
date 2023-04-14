package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLec07Exam01, btnLec07Exam02, btnLec07Exam03, btnLec07Exam04, btnLec07Exam05, btnLec07Exam06;
    Button btnLec07Prac01, btnLec07Prac02, btnLec07Prac03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLec07Exam01 = (Button) findViewById(R.id.btn_lec07_exam01);
        btnLec07Exam02 = (Button) findViewById(R.id.btn_lec07_exam02);
        btnLec07Exam03 = (Button) findViewById(R.id.btn_lec07_exam03);
        btnLec07Exam04 = (Button) findViewById(R.id.btn_lec07_exam04);
        btnLec07Exam05 = (Button) findViewById(R.id.btn_lec07_exam05);
        btnLec07Exam06 = (Button) findViewById(R.id.btn_lec07_exam06);

        btnLec07Prac01 = (Button) findViewById(R.id.btn_lec07_prac01);
        btnLec07Prac02 = (Button) findViewById(R.id.btn_lec07_prac02);
        btnLec07Prac03 = (Button) findViewById(R.id.btn_lec07_prac03);

        btnLec07Exam01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam01.class);
                startActivity(intent);
            }
        });

        btnLec07Exam02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam02.class);
                startActivity(intent);
            }
        });

        btnLec07Exam03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam03.class);
                startActivity(intent);
            }
        });

        btnLec07Exam04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam04.class);
                startActivity(intent);
            }
        });

        btnLec07Exam05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam05.class);
                startActivity(intent);
            }
        });

        btnLec07Exam06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exam06.class);
                startActivity(intent);
            }
        });

        btnLec07Prac01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac01.class);
                startActivity(intent);
            }
        });

        btnLec07Prac02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac02.class);
                startActivity(intent);
            }
        });

        btnLec07Prac03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac03.class);
                startActivity(intent);
            }
        });
    }
}