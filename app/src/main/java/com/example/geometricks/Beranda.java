package com.example.geometricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Beranda extends AppCompatActivity {
ImageView button;
ImageView button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        button=findViewById(R.id.mat1);
        button1=findViewById(R.id.teach);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Beranda.this,Tanyatutor .class);
                startActivity(intent1);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Beranda.this,Materi .class);
                startActivity(intent);
            }
        });
    }
}