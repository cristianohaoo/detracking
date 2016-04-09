package com.dataeye.gonghao.mygradledemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dataeye.gonghao.mylibrary.MyTestApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String test = MyTestApi.test();
        Log.d("app test = ",test);
    }
}
