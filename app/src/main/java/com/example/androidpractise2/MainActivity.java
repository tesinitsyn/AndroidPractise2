package com.example.androidpractise2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_test);
        ImageView cat = (ImageView)findViewById(R.id.imageView2);
        cat.setImageResource(R.drawable.kitty_marusya);
        TextView putText = (TextView) findViewById(R.id.inputText);
        putText.setText(R.string.input_text);

    }
}