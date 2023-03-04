package com.example.mad_task_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.count_text);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.button_label_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
    }
}