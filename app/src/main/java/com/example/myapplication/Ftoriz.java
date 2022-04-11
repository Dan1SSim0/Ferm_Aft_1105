package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;



public class Ftoriz extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ftoriz);


    }

    int start_x = 0;
    int end_x = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                start_x = (int) event.getX();
                break;
            case MotionEvent.ACTION_DOWN:
                end_x = (int) event.getX();
                break;
        }


        if (start_x != 0 && end_x != 0) {
            if (start_x > end_x) {
                setContentView(R.layout.ftoriz);
            } else if (start_x < end_x) {
                setContentView(R.layout.registr);
            }

            start_x = 0;
            end_x = 0;
        }

        return false;


    }
}