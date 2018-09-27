package com.example.user.hello_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.user.hello_hospital.Doctor_Details.DoctorFirst_Activity;

public class SplashScreen_Activity extends AppCompatActivity {

    private ProgressBar progressBar ;
    int progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_);

        setTitle(" Welcome ");

        progressBar = findViewById(R.id.progressBar_id);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startOn();

            }
        });

        thread.start();

    }

    private void doWork() {

        for (progress=10;progress<=100;progress = progress+10){

            try {
                Thread.sleep(100);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
    public void startOn (){
        startActivity(new Intent(SplashScreen_Activity.this, FirstActivity.class));
        finish();
    }
}
