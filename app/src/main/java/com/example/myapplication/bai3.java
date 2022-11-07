package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;


public class bai3 extends AppCompatActivity {
    private ImageView bai3_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        Init();
        Action();
    }

    private void Init() {
        bai3_circle = (ImageView) findViewById(R.id.bai3_circle);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Path path = new Path();
            path.arcTo(0f,0f,1000f,1000f,270f,-180f,true);
            ObjectAnimator animator = ObjectAnimator.ofFloat(bai3_circle,bai3_circle.X,bai3_circle.Y,path);
            animator.setDuration(2000);
            animator.start();
        }
    }

    private void Action() {

    }
}