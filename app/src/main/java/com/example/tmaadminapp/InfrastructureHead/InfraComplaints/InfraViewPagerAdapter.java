package com.example.tmaadminapp.InfrastructureHead.InfraComplaints;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tmaadminapp.InfrastructureHead.ComplaintsFragments.CompletedComplaints.InfraCompletedComplaints;
import com.example.tmaadminapp.InfrastructureHead.ComplaintsFragments.PendingComplaints.InfraPendingComplaints;

public class InfraViewPagerAdapter extends FragmentPagerAdapter {

    public InfraViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new InfraPendingComplaints();
        }
        else if (position == 1)
        {
            fragment = new InfraCompletedComplaints();
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Pending Complaints";
        }
        else if (position == 1)
        {
            title = "Completed Complaints";
        }

        return title;
    }
}
