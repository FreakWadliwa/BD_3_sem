package com.example.bd_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moorning;
                if (editText.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, R.string.morning, Toast.LENGTH_LONG).show();
                else
                Toast.makeText(MainActivity.this, R.string.noMorning, Toast.LENGTH_SHORT).show();
            }
        });
    }
}