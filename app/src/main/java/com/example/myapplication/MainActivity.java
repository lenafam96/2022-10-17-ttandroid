package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_bai3,btn_bai4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Action();
    }

    private void Init() {
        btn_bai3 = (Button) this.findViewById(R.id.btn_bai3);
        btn_bai4 = (Button) this.findViewById(R.id.btn_bai4);
    }

    private void Action() {
        btn_bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai3.class);
                startActivity(intent);
            }
        });
        btn_bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai4.class);
                startActivity(intent);
            }
        });
    }
}