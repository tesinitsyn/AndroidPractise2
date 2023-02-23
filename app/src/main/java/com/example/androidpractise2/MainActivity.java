package com.example.androidpractise2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "My App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView cat = (ImageView)findViewById(R.id.imageView2);
//        cat.setImageResource(R.drawable.kitty_marusya);
//        TextView putText = (TextView) findViewById(R.id.inputText);
//        putText.setText(R.string.input_text);
        Button helloWorldButton = (Button) findViewById(R.id.action_test_button_2);
        helloWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView helloWorld = (TextView)findViewById(R.id.textView3);
                helloWorld.setText("Hello world!");
                Log.e(
                        TAG, "Just logs for practise"
                );
            }
        });
    }

    public void displayNewText(View view) {
        TextView helloWorld = (TextView)findViewById(R.id.textView3);
        helloWorld.setText("Idk why you want smth else");
        Log.e(
                TAG, "Just logs for practise"
        );
    }
}