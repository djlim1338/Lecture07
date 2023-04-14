package com.cookandroid.lecture07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class Exam01 extends AppCompatActivity {

    LinearLayout exam01Layout;

    Button exam01Btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam01);

        exam01Layout = (LinearLayout) findViewById(R.id.exam01_layout);
        exam01Btn01 = (Button) findViewById(R.id.exam01_btn1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.exam01_itemRed:
                exam01Layout.setBackgroundColor(Color.RED);
                return true;
            case R.id.exam01_itemGreen:
                exam01Layout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.exam01_itemBlue:
                exam01Layout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.exam01_subRotate:
                exam01Btn01.setRotation(45);
                return true;
            case R.id.exam01_subSize:
                exam01Btn01.setScaleX(2);
                return true;
        }
        return false;
    }
}