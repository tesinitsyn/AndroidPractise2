package com.example.androidpractise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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



        Button returnButton = (Button) findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}