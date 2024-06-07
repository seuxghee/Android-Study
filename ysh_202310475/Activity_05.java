package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_05 extends Activity {
    Button button20, button21, button22;
    EditText  editTextNumber7, editTextNumber9, editTextNumber10;
    TextView textView13,textView14;
    int num1, num2, num3;
    Integer result, result1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05);

        editTextNumber7= (EditText) findViewById(R.id.editTextNumber7);
        editTextNumber9= (EditText) findViewById(R.id.editTextNumber9);
        editTextNumber10= (EditText) findViewById(R.id.editTextNumber10);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        textView13=(TextView) findViewById(R.id.textView13);
        textView14=(TextView) findViewById(R.id.textView14);
        //계산하기 버튼
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editTextNumber7.getText().length() != 0) && (editTextNumber9.getText().length() != 0) && (editTextNumber10.getText().length() != 0)) {
                    num1 = Integer.parseInt(editTextNumber7.getText().toString()); //피자 개수
                    num2 = Integer.parseInt(editTextNumber9.getText().toString()); //스파게티 개수
                    num3 = Integer.parseInt(editTextNumber10.getText().toString()); //샐러드 개수
                    int result1 = num1 + num2 + num3; //주문 개수
                    result= (15000*num1)+(13000*num2)+(9000*num3); // 주문 금액
                    textView13.setText(" 개수: " + result1);
                    textView14.setText(" 금액 :" + result.toString()); // xml 텍스트칸 주의하기
                } else{
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                }
            }
        });
        //초기화 버튼
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber7.setText("");
                editTextNumber9.setText("");
                editTextNumber10.setText("");
            }
        });
        //돌아가기 버튼
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
