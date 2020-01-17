package com.example.tmaadminapp.Administration.AdminStaffManagement.WorkerListInAdminPage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tmaadminapp.R;
import com.example.tmaadminapp.SanitationHead.SanitationWorkers.WorkerDetailActivity;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class AdapterForWorkerListRecyclerInAdmin extends RecyclerView.Adapter<AdapterForWorkerListRecyclerInAdmin.MyViewHolder>
{
    private ArrayList<ModelForWorkerLIstInAdmin> arrayList;
    private Context context;

    public AdapterForWorkerListRecyclerInAdmin(ArrayList<ModelForWorkerLIstInAdmin> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View myView = LayoutInflater.from(context).inflate(R.layout.worker_list_in_admin_page, null);
        MyViewHolder holder = new MyViewHolder(myView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        ModelForWorkerLIstInAdmin model = arrayList.get(position);

        holder.setWorkerName(model.getWorkerName());
        holder.setField(model.getField());
        holder.setRateGrading(model.getRatingGrade());
        holder.setRatingBar(model.getRatingGrade());

        holder.workerCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, WorkerDetailActivity.class));

            }
        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView field , workerName, rateGrading;
        private RatingBar ratingBar;
        private ImageView workerImage;
        private MaterialCardView workerCardView;
        private View mView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            workerCardView = mView.findViewById(R.id.workerCardViewInAdmin);

        }

        private void setField(String workerField)
        {
            field = mView.findViewById(R.id.worker_field_text_admin_worker_list);
            field.setText(workerField);
        }

        private void setWorkerName(String wName)
        {
            workerName = mView.findViewById(R.id.workerNameInItemDesign);
            workerName.setText(wName);
        }

        private void setRateGrading(float rating)
        {
            rateGrading = mView.findViewById(R.id.ratingResultInItemDesign);

            if(rating > 1 && rating <=2.5)
        {
            rateGrading.setText("Not Satisfied");
        }
           else if(rating > 2.5 && rating <=3.5)
        {
            rateGrading.setText("Average");
        }
           else if(rating > 3.5 && rating <=4.5)
        {
            rateGrading.setText("Excellent");
        }
           else if(rating > 4.5)
        {
            rateGrading.setText("Outstanding");
        }


    }


    private void setRatingBar (float workerRating)
    {
        ratingBar  = mView.findViewById(R.id.workerRatingInItemDesign);
        ratingBar.setRating(workerRating);
    }



     /*  private void setWorkerImage(int image)
        {
            workerImage = mView.findViewById(R.id.workerProfileImageInItemDesign);
            workerImage.setImageResource(R.drawable.avatar);
        }*/



    }
}
