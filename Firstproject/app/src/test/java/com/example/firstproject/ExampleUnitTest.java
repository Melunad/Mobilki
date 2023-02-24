package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hello onCreate", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это Log.i в onCreate");
        Log.e(TAG, "Это Log.e в onCreate");
        Log.w(TAG, "Это Log.w в onCreate");
        Log.d(TAG, "Это Log.d в onCreate");
        Log.v(TAG, "Это Log.v в onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Hello onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Это Log.i в onStart");
        Log.e(TAG, "Это Log.e в onStart");
        Log.w(TAG, "Это Log.w в onStart");
        Log.d(TAG, "Это Log.d в onStart");
        Log.v(TAG, "Это Log.v в onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Hello onStop", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это Log.i в onStop");
        Log.e(TAG, "Это Log.e в onStop");
        Log.w(TAG, "Это Log.w в onStop");
        Log.d(TAG, "Это Log.d в onStop");
        Log.v(TAG, "Это Log.v в onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Hello onDestroy", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это Log.i в onDestroy");
        Log.e(TAG, "Это Log.e в onDestroy");
        Log.w(TAG, "Это Log.w в onDestroy");
        Log.d(TAG, "Это Log.d в onDestroy");
        Log.v(TAG, "Это Log.v в onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Hello onPause", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это Log.i в onPause");
        Log.e(TAG, "Это Log.e в onPause");
        Log.w(TAG, "Это Log.w в onPause");
        Log.d(TAG, "Это Log.d в onPause");
        Log.v(TAG, "Это Log.v в onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Hello onResume", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это Log.i в onResume");
        Log.e(TAG, "Это Log.e в onResume");
        Log.w(TAG, "Это Log.w в onResume");
        Log.d(TAG, "Это Log.d в onResume");
        Log.v(TAG, "Это Log.v в onResume");
    }
}
