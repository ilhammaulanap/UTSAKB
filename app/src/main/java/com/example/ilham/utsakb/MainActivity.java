package com.example.ilham.utsakb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Nama  : Ilham Maulana Pratama
//NIM   : 10116335
//KLS   : IF 8
//TGL   : 5 Mei 2019
public class MainActivity extends AppCompatActivity {
    private int waktu_loading=5000;
    //5000=5detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading lansung ke home
                Intent home=new Intent(MainActivity.this, home.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
