package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Activity02 extends Activity {
    EditText editText, editNumber1,editPassword1,editPassword2,editEmail;
    Button button6, button7, button8, button9;
    String num1, num2, num3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);

        editText = (EditText) findViewById(R.id.editText);
        editNumber1 = (EditText) findViewById(R.id.editNumber1);
        editPassword1 = (EditText) findViewById(R.id.editPassword1);
        editPassword2 = (EditText) findViewById(R.id.editPassword2);
        editEmail = (EditText) findViewById(R.id.editEmail);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editText.getText().length() !=0)&&(editNumber1.getText().length() !=0)&&(editPassword1.getText().length() !=0)) {
                    num1 = editText.getText().toString();
                    num2 = editNumber1.getText().toString();
                    num3 = editPassword1.getText().toString();
                    //데이터 전달하기
                    Intent mint = new Intent(getApplicationContext(), Activity03.class); //데이터 넘길 때
                    mint.putExtra("putdata1", num1); //이름
                    mint.putExtra("putdata2", num2); //학번
                    mint.putExtra("putdata3", num3); // 비번
                    startActivity(mint);


                } else {
                    Toast.makeText(getApplicationContext(),"똑바로 입력해", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
