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

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editTextNumber7.getText().length() != 0) && (editTextNumber9.getText().length() != 0) && (editTextNumber10.getText().length() != 0)) {
                    num1 = Integer.parseInt(editTextNumber7.getText().toString());
                    num2 = Integer.parseInt(editTextNumber9.getText().toString());
                    num3 = Integer.parseInt(editTextNumber10.getText().toString());
                    int result1 = num1 + num2 + num3;
                    result= (15000*num1)+(13000*num2)+(9000*num3);
                    textView13.setText(" 개수: " + result1);
                    textView14.setText("결과 :" + result.toString());
                } else{
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber7.setText("");
                editTextNumber9.setText("");
                editTextNumber10.setText("");
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
