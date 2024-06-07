package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_02 extends Activity {
    Button button15, button14, button10,button11,button12,button13;
    EditText editTextNumber3,editTextNumber4;
    int num1, num2;
    Integer result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_02);

            editTextNumber3 = (EditText) findViewById(R.id.editTextNumber3);
            editTextNumber4= (EditText) findViewById(R.id.editTextNumber4);
            button10 = (Button) findViewById(R.id.button10);
            button11 = (Button) findViewById(R.id.button11);
            button12 = (Button) findViewById(R.id.button12);
            button13 = (Button) findViewById(R.id.button13);
            button14 = (Button) findViewById(R.id.button14);
            button15 = (Button) findViewById(R.id.button15);

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if ((editTextNumber3.getText().length() !=0) && (editTextNumber4.getText().length() !=0)){
                        num1 = Integer.parseInt(editTextNumber3.getText().toString());
                        num2 = Integer.parseInt(editTextNumber4.getText().toString());
                        result = num1+num2;
                        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                    }
                }
            });
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if ((editTextNumber3.getText().length() !=0) && (editTextNumber4.getText().length() !=0)){
                        num1 = Integer.parseInt(editTextNumber3.getText().toString());
                        num2 = Integer.parseInt(editTextNumber4.getText().toString());
                        result = num1-num2;
                        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                    }
                }
            });
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if ((editTextNumber3.getText().length() !=0) && (editTextNumber4.getText().length() !=0)){
                        num1 = Integer.parseInt(editTextNumber3.getText().toString());
                        num2 = Integer.parseInt(editTextNumber4.getText().toString());
                        result = num1*num2;
                        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                    }
                }
            });
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if ((editTextNumber3.getText().length() !=0) && (editTextNumber4.getText().length() !=0)){
                        num1 = Integer.parseInt(editTextNumber3.getText().toString());
                        num2 = Integer.parseInt(editTextNumber4.getText().toString());
                        result = num1/num2;
                        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "똑바로 입력해라",Toast.LENGTH_LONG).show();
                    }
                }
            });
            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editTextNumber3.setText("");
                    editTextNumber4.setText("");
                }
            });

            button15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
    }
}
