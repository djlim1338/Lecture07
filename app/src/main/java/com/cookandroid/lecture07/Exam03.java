package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Exam03 extends AppCompatActivity {

    LinearLayout exam03Layout;
    Button exam03Btn1, exam03Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam03);
        setTitle("배경색 바꾸기");

        exam03Layout = (LinearLayout) findViewById(R.id.exam03_layout);

        exam03Btn1 = (Button) findViewById(R.id.exam03_btn1);
        registerForContextMenu(exam03Btn1);
        exam03Btn2 = (Button) findViewById(R.id.exam03_btn2);
        registerForContextMenu(exam03Btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v == exam03Btn1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.exam03_menu1, menu);
        }
        if(v == exam03Btn2){
            mInflater.inflate(R.menu.exam03_menu2, menu);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.exam03_menu1, menu);
        return true;
    }
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.exam02_itemRotate:
                exam02ImageView1.setRotation(Float.parseFloat(exam02EdtAngle.getText()
                        .toString()));
                return true;
            case R.id.exam02_item1:
                exam02ImageView1.setImageResource(R.drawable.jeju2);
                return true;
            case R.id.exam02_item2:
                exam02ImageView1.setImageResource(R.drawable.jeju14);
                return true;
            case R.id.exam02_item3:
                exam02ImageView1.setImageResource(R.drawable.jeju6);
                return true;
        }
        return false;
    }

     */
}