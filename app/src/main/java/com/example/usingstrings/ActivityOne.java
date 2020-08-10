package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView = findViewById(R.id.textView);
        textView.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() invoked");
    }

    public void onStart(){
        super.onStart();
        Log.i("LifeCycle", "onStart() invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i("LifeCycle", "onRestart() invoked");
    }

    public void onResume(){
        super.onResume();
        Log.i("LifeCycle", "onResume() invoked");
    }
}
