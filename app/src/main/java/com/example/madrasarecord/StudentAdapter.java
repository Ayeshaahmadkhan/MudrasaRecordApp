package com.example.madrasarecord;
import com.example.madrasarecord.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private final List<Student> studentList;
    private final Context context;

    public StudentAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_item, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentList.get(position);

        holder.tvName.setText(student.getName());
        holder.tvAge.setText(String.valueOf(student.getAge()));
        holder.tvClass.setText(student.getStudentClass());
        holder.tvSabaq.setText(student.getSabaq());
        holder.tvSabaqi.setText(student.getSabaqi());
        holder.tvManzil.setText(String.valueOf(student.getManzil()));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder {
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
}
