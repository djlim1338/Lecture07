package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
        setTitle("배경색 바꾸기(컨텍스트 메뉴)");

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

            menu.add(0, 1, 0, "배경색(빨강)");
            menu.add(0, 2, 0, "배경색(초록)");
            menu.add(0, 3, 0, "배경색(파랑)");
            //mInflater.inflate(R.menu.exam03_menu1, menu);
        }
        if(v == exam03Btn2){
            menu.add(0, 4, 0, "버튼 45도 회전");
            menu.add(0, 5, 0, "버튼 2배 확대");
            //mInflater.inflate(R.menu.exam03_menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
                exam03Layout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                exam03Layout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                exam03Layout.setBackgroundColor(Color.BLUE);
                return true;
            case 4:
                exam03Btn2.setRotation(45);
                return true;
            case 5:
                exam03Btn2.setScaleX(2);
                exam03Btn2.setScaleY(2);
                return true;
        }
        return false;
    }
}