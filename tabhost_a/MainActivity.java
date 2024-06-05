package com.example.tabhost_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {
    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        th = (TabHost) findViewById(R.id.tabHost);
        th.setup();

        TabHost.TabSpec tap1 = th.newTabSpec("SONG");
        tap1.setIndicator("음악별");
        tap1.setContent(R.id.tab1);
        th.addTab(tap1);

        TabHost.TabSpec tap2 = th.newTabSpec("ARTIST");
        tap2.setIndicator("가수별");
        tap2.setContent(R.id.tab2);
        th.addTab(tap2);

        TabHost.TabSpec tap3 = th.newTabSpec("ALBUM");
        tap3.setIndicator("앨범별");
        tap3.setContent(R.id.tab4);
        th.addTab(tap3);

        TabHost.TabSpec tap4 = th.newTabSpec("Record");
        tap4.setIndicator("기록별");
        tap4.setContent(R.id.tab4);
        th.addTab(tap4);

        th.setCurrentTab(0);
    }
}