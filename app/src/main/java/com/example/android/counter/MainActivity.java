package com.example.android.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOne(View v) {
        displayNum(value += 1);
    }

    public void displayNum(int value) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        String b = String.format("%04d", value);
        scoreView.setText(b);
    }
}