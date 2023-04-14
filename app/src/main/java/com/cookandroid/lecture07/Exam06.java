package com.cookandroid.lecture07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exam06 extends AppCompatActivity {

    TextView exam06TvName, exam06TvEmail;
    Button exam06Btn1;
    EditText exam06DlgEdtName, exam06DlgEdtEmail;
    TextView exam06ToastTv;
    View exam06Dlg, exam06Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam06);

        exam06TvName = (TextView) findViewById(R.id.exam06_tvName);
        exam06TvEmail = (TextView) findViewById(R.id.exam06_tvEmail);
        exam06Btn1 = (Button) findViewById(R.id.exam06_btn1);

        exam06Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exam06Dlg = (View) View.inflate(Exam06.this, R.layout.exam06_dialog1, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Exam06.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(exam06Dlg);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        exam06DlgEdtName = (EditText) exam06Dlg.findViewById(R.id.exam06_dialog1_edtName);
                        exam06DlgEdtEmail = (EditText) exam06Dlg.findViewById(R.id.exam06_dialog1_edtEmail);

                        exam06TvName.setText(exam06DlgEdtName.getText().toString());
                        exam06TvEmail.setText(exam06DlgEdtEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(Exam06.this);
                        exam06Toast = (View) View.inflate(Exam06.this, R.layout.exam06_toast1, null);
                        exam06ToastTv = (TextView) exam06Toast.findViewById(R.id.exam06_toast1_tv1);
                        exam06ToastTv.setText("취소했습니다.");
                        toast.setView(exam06Toast);
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }
}