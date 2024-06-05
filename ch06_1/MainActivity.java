package com.example.ch06_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chro;
    Button btnStart, btnStop;
    RadioButton rdoCal, rdoTime;
    CalendarView cal;
    TimePicker time;
    TextView tv1,tv2,tv3,tv4,tv5;
    int a, b, c; //캘린더 뷰에서 선택한 년, 월, 일을 가져올 변수 선언(정수로)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("예약시스템"); //액션바 제목

        chro = (Chronometer) findViewById(R.id.chro);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop= (Button) findViewById(R.id.btnStop);
        rdoCal= (RadioButton) findViewById(R.id.rdoCal);
        rdoTime= (RadioButton) findViewById(R.id.rdoTime);
        cal= (CalendarView) findViewById(R.id.cal);
        time= (TimePicker) findViewById(R.id.time);
        tv1= (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);
        tv3= (TextView) findViewById(R.id.tv3);
        tv4= (TextView) findViewById(R.id.tv4);
        tv5= (TextView) findViewById(R.id.tv5);

        cal.setVisibility(View.INVISIBLE);
        time.setVisibility(View.INVISIBLE);


        //날자 라디오 버튼
        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.setVisibility(View.VISIBLE);
                time.setVisibility(View.INVISIBLE);
            }
        });
        //시간 라디오 버튼
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.setVisibility(View.INVISIBLE);
                time.setVisibility(View.VISIBLE);
            }
        });
        //예약 시작 버튼
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chro.setBase(SystemClock.elapsedRealtime()); //0초부터 시작
                chro.start();
                chro.setTextColor(Color.RED);
            }
        });
        //예약 완료 버튼
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chro.stop();
                chro.setTextColor(Color.BLUE);
                //년,월,일,시간,분에 관한 정보를 기록함
                tv1.setText(Integer.toString(a));
                tv2.setText(Integer.toString(b));
                tv3.setText(Integer.toString(c));

                tv4.setText(Integer.toString(time.getHour()));
                tv5.setText(Integer.toString(time.getMinute()));


            }
        });
        // 날짜가 변경되는 부분
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                a = i; //년
                b = i1+1; //월
                c = i2; //일
            }
        });

    }
}