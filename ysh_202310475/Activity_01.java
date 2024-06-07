package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_01 extends Activity {
    Button button7, button8, button9;
    EditText editTextNumber,editTextNumber2;
    int num1, num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextNumber2= (EditText) findViewById(R.id.editTextNumber2);

        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        //총 금액 계산하기
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editTextNumber.getText().length() !=0) && (editTextNumber2.getText().length() !=0)){
                    num1 = Integer.parseInt(editTextNumber.getText().toString()); //물품가격
                    num2 = Integer.parseInt(editTextNumber2.getText().toString());// 물품개수
                    result = num1*num2; //총 금액 계산 
                    Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show(); //토스트 메시지로 결과 출력
                } else {
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                }
            }
        });
        //초기화 버튼
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.setText("");
                editTextNumber2.setText("");
            }
        });
        //돌아가기 버튼
                button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
