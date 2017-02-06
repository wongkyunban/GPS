package com.wong.gps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this,GPSActivity.class);
        //Intent intent = new Intent(MainActivity.this,AnimationActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
