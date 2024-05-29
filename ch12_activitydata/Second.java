package com.cookandroid.ch12_activitydata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Second extends Activity {
    TextView textView2, textView3, textView4 ;
    Button button;

    Integer value1, value2, result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Intent in = getIntent(); // 데이터 받기
        value1 = in.getIntExtra("putdata1",0); //첫번째 값
        value2 = in.getIntExtra("putdata2",0); //두번째 값
        result = value1+value2;


        textView2 =(TextView) findViewById(R.id.textView2);
        textView3 =(TextView) findViewById(R.id.textView3);
        textView4 =(TextView) findViewById(R.id.textView4);
        button =(Button) findViewById(R.id.button);

        textView2.setText("넘어온 첫번재 정수:" + value1.toString());
        textView3.setText("넘어온 두번재 정수:" + value2.toString());
        textView4.setText("더해진 결과:" + result.toString());





    }
}
