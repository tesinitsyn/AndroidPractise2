package com.example.androidpractise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }

    public void submitMethod(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        name = (TextInputEditText) findViewById(R.id.Name);
        surname = (TextInputEditText) findViewById(R.id.surname);
        email = (TextInputEditText) findViewById(R.id.email);
        intent.putExtra("name", name.getText());
        intent.putExtra("surname", surname.getText());
        intent.putExtra("email", email.getText());
        startActivity(intent);
    }
}