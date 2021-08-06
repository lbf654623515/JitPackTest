package com.zzjy.module2.jitpacktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zzjy.module2.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Test().test();
    }
}