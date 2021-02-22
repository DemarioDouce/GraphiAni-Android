package com.demariodouce.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Exercise1Activity extends AppCompatActivity {
    int color;
    Spinner spinner ;
    RadioButton rdRed, rdCyan,rdYYellow;
    Button btnUp, btnDown, btnLeft,btnRight, btnClear ;

    int offsetX=30;
    int offsetY=50;

    Paint paint = new Paint();
    Canvas canvas;
    Bitmap bitmap;
    ImageView imgView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

//        spinner = (Spinner) findViewById(R.id.spinner);
//        final String[] sizes = { "10", "20", "30", "40", "50" };
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sizes);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        imgView =(ImageView)findViewById(R.id.imageView);
//        btnUp = (Button) findViewById(R.id.btnUp);
//        btnDown = (Button) findViewById(R.id.btnDown);
//        btnLeft = (Button) findViewById(R.id.btnLeft);
//        btnRight = (Button) findViewById(R.id.btnRight);
//        btnClear =(Button) findViewById(R.id.btnClear);
//        rdRed = (RadioButton) findViewById(R.id.rdRed);
//        rdYYellow = (RadioButton) findViewById(R.id.rdYellow);
//        rdCyan = (RadioButton) findViewById(R.id.rdCyan);
//        bitmap  = Bitmap.createBitmap(
//                500, // Width
//                300, // Height
//                Bitmap.Config.ARGB_8888 // Config
//        );
//        canvas = new Canvas(bitmap);
//
//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bitmap  = Bitmap.createBitmap(
//                        500, // Width
//                        400, // Height
//                        Bitmap.Config.ARGB_8888 );// Config
//                canvas = new Canvas(bitmap);
//                imgView.setImageBitmap(bitmap);
//
//                int offsetX=200;
//                int offsetY=450;
//            }
//        });
//
//        btnDown.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setSyle();
//                canvas.getWidth();
//                // Draw a line on canvas at the center position
//                canvas.drawLine(
//                        offsetX,  // startX
//                        offsetY,
//                        offsetX,// stopX
//                        offsetY =offsetY+3 == canvas.getHeight() ? offsetY : offsetY+3, // stopY
//                        paint    // Paint
//                );
//                // Display the newly created bitmap on app interface
//                imgView.setImageBitmap(bitmap);
//            }
//        });
//
//        btnUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setSyle();
//                canvas.getWidth();
//                // Draw a line on canvas at the center position
//                canvas.drawLine(
//                        offsetX,  // startX
//                        offsetY, // startY
//                        offsetX, // stopX
//                        offsetY = offsetY-3 == 0 ? offsetY : offsetY-3,// , // stopY
//                        paint    // Paint
//                );
//                imgView.setImageBitmap(bitmap);
//            }
//        });
//
//        btnLeft.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setSyle();
//                canvas.getWidth();
//                // Draw a line on canvas at the center position
//                canvas.drawLine(
//                        offsetX,  // startX
//                        offsetY, // startY
//                        offsetX=offsetX+3 == canvas.getWidth() ? offsetX : offsetX+3, // stopX
//                        offsetY, // stopY
//                        paint    // Paint// stopY
//                        // Paint
//                );
//                // Display the newly created bitmap on app interface
//                imgView.setImageBitmap(bitmap);
//            }
//        });
//
//        btnRight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setSyle();
//                canvas.getWidth();
//                canvas.drawLine(
//                        offsetX,  // startX
//                        offsetY, // startY
//                        offsetX= offsetX-3 == 0 ? offsetX : offsetX-3, // stopX
//                        offsetY, // stopY
//                        paint    // Paint
//                );
//                // Display the newly created bitmap on app interface
//                imgView.setImageBitmap(bitmap);
//            }
//        });
//    }
//
//    void setSyle()
//    {
//        color = rdRed.isChecked()? Color.RED :rdCyan.isChecked()? Color.CYAN: rdYYellow.isChecked()? Color.YELLOW: Color.YELLOW;
//        paint.setColor(color);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth((Float.parseFloat(spinner.getSelectedItem().toString())));
//        paint.setAntiAlias(true);
    }

}