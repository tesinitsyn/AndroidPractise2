package com.example.androidpractise2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegistrationActivity extends AppCompatActivity {

    TextInputEditText name;
    TextInputEditText surname;
    TextInputEditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Intent intent = new Intent(this, ProfileActivity.class);

        Button submit = (Button) findViewById(R.id.submit_button);

        ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    TextView textView = new TextView(this);
                    textView.setTextSize(20);
                    textView.setPadding(16, 16, 16, 16);
                    textView.setText("Contract done");
                    setContentView(textView);
                }
        );

        submit.setOnClickListener(v -> {
            name = (TextInputEditText) findViewById(R.id.Name);
            surname = (TextInputEditText) findViewById(R.id.surname);
            email = (TextInputEditText) findViewById(R.id.email);
            intent.putExtra("name", name.getText());
            intent.putExtra("surname", surname.getText());
            intent.putExtra("email", email.getText());
            mStartForResult.launch(intent);
        });
    }
}