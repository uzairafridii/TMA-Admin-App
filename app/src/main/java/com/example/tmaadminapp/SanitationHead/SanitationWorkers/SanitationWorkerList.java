package com.example.tmaadminapp.SanitationHead.SanitationWorkers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tmaadminapp.R;

public class SanitationWorkerList extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitation_worker_list);
        initViews();

    }

    private void initViews()
    {
        mToolbar = findViewById(R.id.sanitation_worker_list_tool_bar);
        setSupportActionBar(mToolbar);
        setTitle("Worker List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void fabAddWorkerClick(View view)
    {
        View customView =  LayoutInflater.from(this).inflate(R.layout.add_worker_dialog_layout, null);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(customView);

        AlertDialog dialog = alert.create();
        dialog.setCanceledOnTouchOutside(false);

      // TextView workerName , workerPhoneNo, workerCnic;
      //  Button addWorkerButton;

        dialog.show();


    }
}
