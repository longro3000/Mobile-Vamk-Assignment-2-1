package com.example.assignment2_1;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {
    String tag="EVH_Demo: ";
    protected String currentTime() {
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        String format = s.format(new Date());
        return format;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate() " + currentTime());
    }
    protected void onStart() {
        super.onStart();
        Log.d(tag, tag + "onStart() " + currentTime());
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(tag, tag + "onReStart() " + currentTime());
    }
    protected void onResume() {
        super.onResume();
        Log.d(tag, tag + "onResume() " + currentTime());
    }
    protected void onPause() {
        super.onPause();
        Log.d(tag, tag + "onPause() " + currentTime());
    }
    protected void onStop() {
        super.onStop();

        Log.d(tag, tag + "onStop() " + currentTime());
    }

    protected void onDestroy() {
        super.onDestroy();

        Log.d(tag, tag + "onDestroy() " + currentTime());
    }
}
