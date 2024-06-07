package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_04 extends Activity {
    Button button23, button24, button25;
    RadioButton radioButton3, radioButton4;
    TextView textView12;
    Float result;
    float inputvalue;

    EditText editTextNumber8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_04);

        editTextNumber8= (EditText) findViewById(R.id.editTextNumber8);
        button24 = (Button) findViewById(R.id.button24);
        button23 = (Button) findViewById(R.id.button23);
        button25 = (Button) findViewById(R.id.button25);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioButton4=(RadioButton)findViewById(R.id.radioButton4);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        textView12=(TextView) findViewById(R.id.textView12);
        // 온도 변환 버튼(섭씨,화씨)
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNumber8.getText().length() != 0) {
                    if (radioButton3.isChecked() == true) {
                        inputvalue = Float.parseFloat(editTextNumber8.getText().toString());
                        result = (inputvalue - 32) * 5 / 9;
                        textView12.setText("결과 :" + result.toString());

                    } else {
                        inputvalue = Float.parseFloat(editTextNumber8.getText().toString());
                        result = (inputvalue * 9 / 5) + 32;
                        textView12.setText("결과 :" + result.toString());
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "정확한 값을 입력하세요", Toast.LENGTH_LONG).show();
                }
            }
        });
        //초기화 버튼
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber8.setText("");

            }
        });
        //돌아가기 버튼
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
