package com.cookandroid.ysh_202310475;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button5;
    EditText editNumber, editPassword;

   String num1, num2;
    String value4,value5,value6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button5 = (Button) findViewById(R.id.button5);
        editNumber = (EditText) findViewById(R.id.editNumber);
        editPassword = (EditText) findViewById(R.id.editPassword);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity02.class);
                startActivity(intent);

            }
        });
        Intent mint = getIntent(); // 데이터 받기
        value4 = mint.getStringExtra("putdata1"); //이름
        value5 = mint.getStringExtra("putdata2"); //학번
        value6 = mint.getStringExtra("putdata3"); //비번


        //로그인 버튼
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editNumber.getText().length() !=0)&&(editPassword.getText().length() !=0)) {
                    if ((editNumber.getText().toString().equals(value5))&&(editPassword.getText().toString().equals(value6))){
                         Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_SHORT).show();
                        Intent mint = new Intent(getApplicationContext(), Activity04.class);
                        startActivity(mint); //로그인 성공시 화면 전환
                    }else {
                        Toast.makeText(getApplicationContext(), "로그인 실패", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(),"똑바로 입력해", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
