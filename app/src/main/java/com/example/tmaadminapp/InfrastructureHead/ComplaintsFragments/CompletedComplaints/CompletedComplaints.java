package com.example.tmaadminapp.InfrastructureHead.ComplaintsFragments.CompletedComplaints;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tmaadminapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompletedComplaints extends Fragment {


    public CompletedComplaints() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completed_complaints2, container, false);
    }

}
