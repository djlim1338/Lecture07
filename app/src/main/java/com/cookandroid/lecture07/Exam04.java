package com.cookandroid.lecture07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exam04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam04);

        final Button exam04Btn1 = (Button) findViewById(R.id.exam04_btn1);

        exam04Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Exam04.this);
                dlg.setTitle("제목입니다.");
                dlg.setMessage("이곳이 내용입니다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Exam04.this, "확인 누름", Toast.LENGTH_LONG).show();
                    }
                });
                dlg.show();
            }
        });
    }
}