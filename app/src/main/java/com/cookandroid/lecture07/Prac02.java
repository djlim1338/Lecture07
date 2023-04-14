package com.cookandroid.lecture07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Prac02 extends AppCompatActivity {

    Button prac02Btn1;
    View prac02Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac02);

        prac02Btn1 = (Button) findViewById(R.id.prac02_btn1);

        prac02Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();

                /*
                
                'getHeight()' is deprecated as of API 15: Android 4.0.3 (IceCreamSandwich) 
                사용이 가능하나 앞으로 사라질 기능이라 대체할거 찾음
                참고 사이트: http://sunphiz.me/wp/archives/911

                 */
                //int xOffset = (int) (Math.random() * display.getHeight());

                Point size = new Point();
                display.getSize(size);
                int xOffset = (int) (Math.random() * size.x);
                int yOffset = (int) (Math.random() * size.y);

                Toast toast = new Toast(Prac02.this);
                prac02Toast = (View) View.inflate(Prac02.this, R.layout.prac02_toast1, null);
                toast.setView(prac02Toast);
                toast.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                toast.show();
            }
        });
    }
}