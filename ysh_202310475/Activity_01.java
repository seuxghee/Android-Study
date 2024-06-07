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
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editTextNumber.getText().length() !=0) && (editTextNumber2.getText().length() !=0)){
                    num1 = Integer.parseInt(editTextNumber.getText().toString());
                    num2 = Integer.parseInt(editTextNumber2.getText().toString());
                    result = num1*num2;
                    Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.setText("");
                editTextNumber2.setText("");
            }
        });
                button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
