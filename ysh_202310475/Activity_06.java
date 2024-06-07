package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_06 extends Activity {
   Button button26, button27,button28;
   EditText editTextNumber11,editTextNumber14,editTextNumber15;
   TextView textView19,textView20;
   int num1, num2, num3;
    Integer result, result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_06);

        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        editTextNumber11= (EditText) findViewById(R.id.editTextNumber11);
        editTextNumber14= (EditText) findViewById(R.id.editTextNumber14);
        editTextNumber15= (EditText) findViewById(R.id.editTextNumber15);
        textView19=(TextView) findViewById(R.id.textView19);
        textView20=(TextView) findViewById(R.id.textView20);
         //점수 계산 버튼
        button26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((editTextNumber11.getText().length() != 0) && (editTextNumber14.getText().length() != 0) && (editTextNumber15.getText().length() != 0)) {
                    num1 = Integer.parseInt(editTextNumber11.getText().toString()); //국어 점수
                    num2 = Integer.parseInt(editTextNumber14.getText().toString()); //영어 점수
                    num3 = Integer.parseInt(editTextNumber15.getText().toString()); //수학 점수
                    int result1 = num1 + num2 + num3; //총점
                    int result = result1 / 3; //평균
                    textView19.setText(" 총점: " + result1);
                    textView20.setText(" 평균: " + result);
                } else {
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라", Toast.LENGTH_LONG).show();
                }
            }
        });
               //초기화 버튼
                button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber11.setText("");
                editTextNumber14.setText("");
                editTextNumber15.setText("");
            }
        });
       //돌아가기 버튼
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
