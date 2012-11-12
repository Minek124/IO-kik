package com.example.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newGameClick(View view){
    	Intent intent = new Intent(this, GameActivity.class);
    	startActivity(intent);
    }
    public void hiscoresClick(View view){
    }
    public void soundsClick(View view){
    }
    public void aboutClick(View view){
    }
    public void exitClick(View view){
    }
}
