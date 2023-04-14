package com.cookandroid.lecture07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exam05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam05);

        final Button exam05Btn1 = (Button) findViewById(R.id.exam05_btn1);
        final Button exam05Btn2 = (Button) findViewById(R.id.exam05_btn2);
        final Button exam05Btn3 = (Button) findViewById(R.id.exam05_btn3);

        exam05Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[] { "Q(10)", "R(11)", "S(12)" };
                AlertDialog.Builder dlg = new AlertDialog.Builder(Exam05.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        exam05Btn1.setText(versionArray[i]);
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        exam05Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[] { "Q(10)", "R(11)", "S(12)" };
                AlertDialog.Builder dlg = new AlertDialog.Builder(Exam05.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setSingleChoiceItems(versionArray, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        exam05Btn2.setText(versionArray[i]);
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        exam05Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[] { "Q(10)", "R(11)", "S(12)" };
                final boolean[] checkArray = new boolean[] { true, false, false };
                AlertDialog.Builder dlg = new AlertDialog.Builder(Exam05.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        exam05Btn3.setText(versionArray[i]);
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}