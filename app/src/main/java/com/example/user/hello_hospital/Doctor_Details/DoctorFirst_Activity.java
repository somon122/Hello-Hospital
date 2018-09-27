package com.example.user.hello_hospital.Doctor_Details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.user.hello_hospital.FirstActivity;
import com.example.user.hello_hospital.R;

public class DoctorFirst_Activity extends AppCompatActivity {

    DoctorsLogin doctorsLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_);

        doctorsLogin = new DoctorsLogin(this);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_medical);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        setTitle("  Hospital Doctors ");


    }

    public void AddDoctor(View view) {

        startActivity(new Intent(DoctorFirst_Activity.this, MainActivity.class));
    }


    public void DoctorList(View view) {
        startActivity(new Intent(DoctorFirst_Activity.this, DoctorList_Activity.class));

    }

    public void Update(View view) {
        startActivity(new Intent(DoctorFirst_Activity.this, DoctorList_Activity.class));

    }

    public void Help(View view) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.doctorList_id:
                startActivity(new Intent(DoctorFirst_Activity.this, DoctorList_Activity.class));
                break;
            case R.id.logOut_id:
                doctorsLogin.Delete();
                startActivity(new Intent(DoctorFirst_Activity.this, FirstActivity.class));
                break;
            default:
                Toast.makeText(this, "Sorry Try Again", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);

    }

}
