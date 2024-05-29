package com.cookandroid.ch12_activitydata;

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
    EditText edit1, edit2;
    Button btnAdd;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edit1.getText().length() !=0)&&(edit2.getText().length() !=0)) {
                    num1 = Integer.parseInt(edit1.getText().toString());
                    num2 = Integer.parseInt(edit2.getText().toString());

                    Intent mint = new Intent(getApplicationContext(), Second.class); //데이터 넘길 때
                    mint.putExtra("putdata1", num1);
                    mint.putExtra("putdata2", num2);
                    startActivity(mint);
                } else {
                    Toast.makeText(getApplicationContext(),"똑바로 입력해", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}