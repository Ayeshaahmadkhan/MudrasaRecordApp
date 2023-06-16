package com.example.madrasarecord;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class StudentDetailsActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvClass;
    private TextView tvSabaq;
    private TextView tvSabaqi;
    private TextView tvManzil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_item);

        // Initialize UI components
        tvName = findViewById(R.id.textViewName);
        TextView tvAge = findViewById(R.id.textViewAge);
        tvClass = findViewById(R.id.textViewClass);
        tvSabaq = findViewById(R.id.textViewSabaq);
        tvSabaqi = findViewById(R.id.textViewSabaqi);
        tvManzil = findViewById(R.id.textViewManzil);

        // Get the selected student data from the intent
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            int age = intent.getIntExtra("age", 0);
            String className = intent.getStringExtra("class");
            String sabaq = intent.getStringExtra("sabaq");
            String sabaqi = intent.getStringExtra("sabaqi");
            int manzil = intent.getIntExtra("manzil", 0);

            // Set the student details to the UI components
            tvName.setText(name);
            tvAge.setText(String.valueOf(age));
            tvClass.setText(className);
            tvSabaq.setText(sabaq);
            tvSabaqi.setText(sabaqi);
            tvManzil.setText(String.valueOf(manzil));
        }
    }
}

