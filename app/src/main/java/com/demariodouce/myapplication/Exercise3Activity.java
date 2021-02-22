package com.demariodouce.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        Animation an;
        final Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                performAnimation(R.anim.animation, 1);
            }
        });

        final Button btnStop = (Button) findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                performAnimation(R.anim.animation, 2);
            }
        });
    }

    private void performAnimation(int animationResourceID, int b_id) {
        // We will animate the imageview
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.moon);
        imageView.setVisibility(View.VISIBLE);
        Animation an = AnimationUtils.loadAnimation(this, animationResourceID);
        // Register a listener, so we can disable and re-enable buttons
        an.setAnimationListener(new MyAnimationListener());
        // Start the animation
        if (b_id == 1)
            imageView.startAnimation(an);
        if (b_id == 2)
            imageView.clearAnimation();
        {
        }
    }
    private void toggleButtons(boolean clickableState)
    {
        final Button btnStart= (Button) findViewById(R.id.btnStart);
        btnStart.setClickable(clickableState);
    }

    class MyAnimationListener implements Animation.AnimationListener {

        public void onAnimationEnd(Animation animation) {
            // Hide our ImageView
            ImageView imageView = (ImageView)findViewById(R.id.imageView);
            imageView.setVisibility(View.INVISIBLE);
            // loop continuously
            // Enable all buttons once animation is over
            toggleButtons(true);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            // Disable all buttons while animation is running
        }

    }
}