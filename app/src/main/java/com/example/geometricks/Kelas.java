package com.example.geometricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Kelas extends AppCompatActivity {
ImageView button;
ImageView button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas);
        button=findViewById(R.id.imageView5);
        button1=findViewById(R.id.imageView14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Kelas.this,Beranda .class);
                startActivity(intent1);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,Beranda .class);
                startActivity(intent);

            }
        });
    }
}