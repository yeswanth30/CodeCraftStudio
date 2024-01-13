package com.stephen;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class stephenmack extends AppCompatActivity {

RelativeLayout ssgsgsg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stephenmack);
        ssgsgsg=findViewById(R.id.ssgsgsg);


        ssgsgsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(stephenmack.this, tony.class);
                startActivity(intent);
            }
        });

    }}