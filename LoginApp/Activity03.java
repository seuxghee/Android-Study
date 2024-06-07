package com.cookandroid.ysh_202310475;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Activity03 extends Activity {
    EditText editText1, editNumber3;
    Button button4;
    String value1, value2,value3 ;

    String num1,num2, num3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);
        editText1 = (EditText) findViewById(R.id.editText1);
        editNumber3 = (EditText) findViewById(R.id.editNumber3);
        button4 = (Button) findViewById(R.id.button4);

        Intent mint = getIntent(); // 데이터 받기
        value1 = mint.getStringExtra("putdata1"); //이름
        value2 = mint.getStringExtra("putdata2"); //학번
        value3 = mint.getStringExtra("putdata3"); //비번


        editText1.setText( value1.toString());
        editNumber3.setText( value2.toString());

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editText1.getText().length() !=0)&&(editNumber3.getText().length() !=0)) {

                    Intent mint = new Intent(getApplicationContext(), MainActivity.class);
                    mint.putExtra("putdata1", value1 ); //이름
                    mint.putExtra("putdata2", value2); //학번
                    mint.putExtra("putdata3", value3); // 비번
                    startActivity(mint);
                } else {
                    Toast.makeText(getApplicationContext(),"똑바로 입력해", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
