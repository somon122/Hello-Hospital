package com.example.user.hello_hospital.MedicalHistory_Details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.hello_hospital.R;

import java.util.ArrayList;

public class MedicalHistoryList_Activity extends AppCompatActivity {

    MedicalHistory_Adapter adapter;
    MedicalHistory_DBManager manager;

    private ListView patient_listView;
    ArrayList<MedicalHistory> medicalHistoryList;

    private  int rowId;
    private String doctorName,details,date,photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list_);

        setTitle("  Medical History List");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_medical);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



        manager = new MedicalHistory_DBManager(getApplicationContext());

        patient_listView = findViewById(R.id.patient_listView_id);


        medicalHistoryList = manager.Get_All_patient_Data();


        adapter = new MedicalHistory_Adapter(this, medicalHistoryList);
        patient_listView.setAdapter(adapter);


        patient_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                rowId = medicalHistoryList.get(position).getId();
                doctorName = medicalHistoryList.get(position).getDoctorName();
                details = medicalHistoryList.get(position).getDetails();
                date = medicalHistoryList.get(position).getDate();
                photo = medicalHistoryList.get(position).getImage();

                Intent intent = new Intent(MedicalHistoryList_Activity.this,MedicalHistory_Data_Rewrite_Activity.class);

                intent.putExtra("id",rowId);

                intent.putExtra("doctorName",doctorName);
                intent.putExtra("details",details);
                intent.putExtra("date",date);
                intent.putExtra("photo",photo);
                startActivity(intent);


            }
        });

    }
}
