package com.cookandroid.lecture07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Prac03 extends AppCompatActivity {

    RadioGroup prac03RdoG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac03);

        prac03RdoG = (RadioGroup) findViewById(R.id.prac03_rdoG);


        prac03RdoG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View dialogView = (View) View.inflate(Prac03.this, R.layout.prac03_img, null);
                ImageView imgV = (ImageView) dialogView.findViewById(R.id.prac03_img_imageView);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Prac03.this);

                String title = "";
                int imgSrc = 0;

                switch(checkedId){
                    case R.id.prac03_rdoDog:
                        title = "강아지";
                        imgSrc = R.drawable.dog;
                        break;
                    case R.id.prac03_rdoCat:
                        title = "고양이";
                        imgSrc = R.drawable.cat;
                        break;
                    case R.id.prac03_rdoRabbit:
                        title = "토끼";
                        imgSrc = R.drawable.rabbit;
                        break;
                    case R.id.prac03_rdoHorse:
                        title = "말";
                        imgSrc = R.drawable.horse;
                        break;
                }
                imgV.setImageResource(imgSrc);
                dlg.setTitle(title);
                dlg.setView(dialogView);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}