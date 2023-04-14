package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class Prac01 extends AppCompatActivity {

    ImageView prac01Imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac01);

        prac01Imgv = (ImageView) findViewById(R.id.prac01_imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);

        menu.add(0, 1, 0, "강아지");
        menu.add(0, 2, 0, "고양이");
        menu.add(0, 3, 0, "토끼");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
                prac01Imgv.setImageResource(R.drawable.dog);
                return true;
            case 2:
                prac01Imgv.setImageResource(R.drawable.cat);
                return true;
            case 3:
                prac01Imgv.setImageResource(R.drawable.rabbit);
                return true;
        }
        return false;
    }


    /*
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.prac01_menu1_item1:
                Toast.makeText(getApplicationContext(), "항목1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.prac01_menu1_item2:
                Toast.makeText(getApplicationContext(), "항목2", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

     */
}