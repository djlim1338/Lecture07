package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class Exam02 extends AppCompatActivity {

    EditText exam02EdtAngle;
    ImageView exam02ImageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam02);
        setTitle("제주도 풍경");

        exam02EdtAngle = (EditText) findViewById(R.id.exam02_edtAngle);
        exam02ImageView1 = (ImageView) findViewById(R.id.exam02_imageView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.exam02_menu1, menu);
        return true;
    }

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
}


