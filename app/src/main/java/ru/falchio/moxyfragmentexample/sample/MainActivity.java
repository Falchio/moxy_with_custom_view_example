package ru.falchio.moxyfragmentexample.sample;

import android.os.Bundle;

import moxy.MvpAppCompatActivity;
import ru.falchio.moxyfragmentexample.R;

public class MainActivity extends MvpAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CounterWidget) findViewById(R.id.frame_1)).init(getMvpDelegate());
        ((CounterWidget) findViewById(R.id.frame_2)).init(getMvpDelegate());
    }
}