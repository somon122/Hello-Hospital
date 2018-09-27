package com.example.user.hello_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.hello_hospital.Doctor_Details.DoctorList_Activity;
import com.example.user.hello_hospital.Doctor_Details.DoctorLoginActivity;
import com.example.user.hello_hospital.MedicalHistory_Details.MedicalHistoryLoginActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_medical);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        setTitle("  SOMON'S HOSPITAL ");




    }

    public void Doctors(View view) {
        startActivity(new Intent(FirstActivity.this, DoctorLoginActivity.class));
    }

    public void MedicalHistory(View view) {
        startActivity(new Intent(FirstActivity.this, MedicalHistoryLoginActivity.class));
    }
}
