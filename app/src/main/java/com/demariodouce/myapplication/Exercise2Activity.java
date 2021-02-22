package com.demariodouce.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise2Activity extends AppCompatActivity {
    AnimationDrawable mframeAnimation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        //
        // Handle Start Button
        final Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            public void onClick(View v) {
                startAnimation();
            }
        });

        // Handle Stop Button
        final Button btnStop = (Button) findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAnimation();
            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.Q)
    private void startAnimation()
    {

        ImageView img = (ImageView)findViewById(R.id.imageView);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.d1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.d2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.d3);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.d4);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.d5);


        int reasonableDuration =250;
        mframeAnimation = new AnimationDrawable();
        mframeAnimation.setOneShot(false);	// loop continuously
        mframeAnimation.addFrame(frame1, reasonableDuration);
        mframeAnimation.addFrame(frame2, reasonableDuration);
        mframeAnimation.addFrame(frame3, reasonableDuration);
        mframeAnimation.addFrame(frame4, reasonableDuration);
        mframeAnimation.addFrame(frame5, reasonableDuration);



        img.setBackground(mframeAnimation);

        mframeAnimation.setVisible(true,true);
        mframeAnimation.start();

    }
    private void stopAnimation()
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false,false);
    }

}
