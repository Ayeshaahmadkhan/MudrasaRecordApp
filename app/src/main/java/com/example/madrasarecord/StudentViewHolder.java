package com.example.madrasarecord;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView tvName, tvAge, tvClass, tvSabaq, tvSabaqi, tvManzil;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.textViewName);
        tvAge = itemView.findViewById(R.id.textViewAge);
        tvClass = itemView.findViewById(R.id.textViewClass);
        tvSabaq = itemView.findViewById(R.id.textViewSabaq);
        tvSabaqi = itemView.findViewById(R.id.textViewSabaqi);
        tvManzil = itemView.findViewById(R.id.textViewManzil);
    }
}

