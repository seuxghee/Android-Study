package com.cookandroid.ysh_202310475;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_03 extends Activity {

    Button  button18, button19,button16,button17;
    EditText editTextNumber5,editTextNumber6;
    int num1, num2;
    Integer result1, result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);

        editTextNumber5 = (EditText) findViewById(R.id.editTextNumber5);
        editTextNumber6= (EditText) findViewById(R.id.editTextNumber6);

        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        //나이 계산 버튼
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editTextNumber5.getText().length() != 0)) {
                    num1 = Integer.parseInt(editTextNumber5.getText().toString());
                    result1 = (2024-num1)+1;
                    Toast.makeText(getApplicationContext(), result1.toString(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 태어난 해 버튼
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( (editTextNumber6.getText().length() != 0)) {
                    num2 = Integer.parseInt(editTextNumber6.getText().toString());
                    result2 = (2024-num2)+1;
                    Toast.makeText(getApplicationContext(), result2.toString(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라", Toast.LENGTH_LONG).show();
                }
            }
        });
        //초기화 버튼
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber5.setText("");
                editTextNumber6.setText("");
            }
        });
        //돌아가기 버튼
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
