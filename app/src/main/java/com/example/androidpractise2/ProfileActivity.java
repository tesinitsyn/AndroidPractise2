package com.example.androidpractise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        String surname = arguments.get("surname").toString();
        String email = arguments.get("email").toString();
        TextView nameView = (TextView) findViewById(R.id.sporstmanName);
        TextView surnameView = (TextView) findViewById(R.id.sporstmanSurname);
        TextView emailView = (TextView) findViewById(R.id.sportmanEmail);

        nameView.setText(name);
        surnameView.setText(surname);
        emailView.setText(email);
    }
}