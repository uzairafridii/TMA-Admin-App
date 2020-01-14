package com.example.tmaadminapp.Administration.AdminStaffManagement.WorkerHeadList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.tmaadminapp.R;

public class WorkerHeadList extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_head_list);
        initViews();

    }

    private void initViews()
    {
        mToolbar = findViewById(R.id.worker_head_tool_bar);
        setTitle("Worker Head");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
