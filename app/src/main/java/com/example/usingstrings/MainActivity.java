package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.tvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i(  "Lifecycle",  "OnCreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(  "Lifecycle",  "onStart Called..");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(  "Lifecycle",  "onResume Called..");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(  "Lifecycle",  "onPause Called..");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(  "Lifecycle",  "onStop Called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(  "Lifecycle",  "onDestroy Called..");
    }
}
