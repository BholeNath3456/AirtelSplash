package com.example.airtelsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private static int Splash=1000;

    Animation  animation;
    View img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         img =(View)findViewById(R.id.image);
         animation= AnimationUtils.loadAnimation(this,R.anim.zoom);
         img.setAnimation(animation);
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                 startActivity(intent);
                 finish();
             }
         },Splash);



    }
}