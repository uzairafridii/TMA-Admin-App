package com.example.tmaadminapp.Administration.AdminHome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tmaadminapp.Administration.AdminStaffManagement.StaffManagementHome.StaffManagementHome;
import com.example.tmaadminapp.R;

public class AdminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
    }

    public void complaintCardClick(View view) {
    }

    public void financeCardClick(View view) {
    }

    public void staffManagementCardClick(View view)
    {
        startActivity(new Intent(this , StaffManagementHome.class));

    }


    public void newsFeedCardClick(View view) {
    }
}
