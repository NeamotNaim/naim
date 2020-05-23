package com.example.cgpa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);


//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//               dowork();
//            }
//
//        });
//        thread.start();
//
//
//
//
//    }
//    void dowork(){
//
//            try {
//                Thread.sleep(3*1000);
//                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        //handler  method for spalash screen


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1*1000);
    }


}
