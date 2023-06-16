package com.example.madrasarecord;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.madrasarecord.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText etName, etAge, etClass, etSabaq, etSabaqi, etManzil;
    private Button btnAddStudent;

    private  DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize database helper
        databaseHelper = new DatabaseHelper(this);

        // Initialize UI components
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etClass = findViewById(R.id.etClass);
        etSabaq = findViewById(R.id.etSabaq);
        etSabaqi = findViewById(R.id.etSabaqi);
        etManzil = findViewById(R.id.etManzil);
        btnAddStudent = findViewById(R.id.btnAddStudent);

        // Set click listener for Add Student button
        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudent();
            }
        });
    }

    private void addStudent() {
        // Retrieve the entered student details
        String name = etName.getText().toString().trim();
        int age = Integer.parseInt(etAge.getText().toString().trim());
        String className = etClass.getText().toString().trim();
        String sabaq = etSabaq.getText().toString().trim();
        String sabaqi = etSabaqi.getText().toString().trim();
        int manzil = Integer.parseInt(etManzil.getText().toString().trim());

        // Create a new Student object
        Student student = new Student(name,
                age,
                className,
                sabaq,
                sabaqi,
                manzil);

        // Insert the student record into the database
        long studentId = databaseHelper.addStudent(student);

        if (studentId != -1) {
            Toast.makeText(this, "Student added successfully with ID: " + studentId, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed to add student", Toast.LENGTH_SHORT).show();
        }

        // Clear the input fields
        clearInputFields();
    }

    private void clearInputFields() {
        etName.setText("");
        etAge.setText("");
        etClass.setText("");
        etSabaq.setText("");
        etSabaqi.setText("");
        etManzil.setText("");
    }
}
