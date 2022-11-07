package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class bai4 extends AppCompatActivity {
    private ImageView bai4_img;
    private Button bai4_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        Init();
        Action();
    }

    private void Init() {
        bai4_btn = (Button) this.findViewById(R.id.bai4_btn);
        bai4_img = (ImageView) this.findViewById(R.id.bai4_img);
//        try {
//            Thread.sleep(500);
//            bai4_img.setImageDrawable(getResources().getDrawable(R.drawable.a1));
//            Thread.sleep(500);
//            bai4_img.setImageDrawable(getResources().getDrawable(R.drawable.a2));
//            Thread.sleep(500);
//            bai4_img.setImageDrawable(getResources().getDrawable(R.drawable.a3));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        new android.os.Handler().postDelayed(
//                new Runnable(){
//                    @Override
//                    public void run() {
//                        bai4_img.setImageDrawable(getResources().getDrawable(R.drawable.a1));
//                    }
//                },500
//        );
//        new android.os.Handler().postDelayed(
//                new Runnable(){
//                    @Override
//                    public void run() {
//                        bai4_img.setImageDrawable(getResources().getDrawable(R.drawable.a2));
//                    }
//                },500
//        );
//          new android.os.Handler().postDelayed(
//                new Runnable(){
//                    int i = 0;
//
//                    @Override
//                    public void run() {
//                        bai4_img.setImageDrawable(getResources().getDrawable(getId(i)));
//                        i++;
//                    }
//                },1500
//        );
    }

    private int getId(int i){
        if (i%3==0)
            return R.drawable.a1;
        if (i%3==1)
            return R.drawable.a2;
        return R.drawable.a3;
    }

    private void Action() {
        bai4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    Path path = new Path();
                    path.arcTo(0f,0f,500f,000f,270f,90f,true);
                    ObjectAnimator animator = ObjectAnimator.ofFloat(bai4_img,bai4_img.X,bai4_img.Y,path);
                    animator.setDuration(2000);
                    animator.start();
                    path.arcTo(500f,0f,500f,2000f,270f,90f,true);
                    animator = ObjectAnimator.ofFloat(bai4_img,bai4_img.X,bai4_img.Y,path);
                    animator.setDuration(2000);
                    animator.start();
                }
//                for(int i=0;i<100;i++){
//                    try {
//                        Thread.sleep(1500);
//                        Log.d("string", String.valueOf(i));
//                    }catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
                new Timer().scheduleAtFixedRate(new TimerTask() {
                    int i=0;
                    @Override
                    public void run() {
                        bai4_img.setImageDrawable(getResources().getDrawable(getId(i)));
                        i++;
                    }
                },0,200);
            }
        });
    }
}