package com.example.androidpractise2;

import static android.os.Build.VERSION_CODES.O;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    private static final String TAG = "My App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_role);
        ImageView cassete = new ImageView(this);
        ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        cassete.setImageResource(R.drawable._673763896cassette_1);
                        setContentView(cassete);
                    }
                }
        );
        //        ImageView cat = (ImageView)findViewById(R.id.imageView2);
//        cat.setImageResource(R.drawable.kitty_marusya);
//        TextView putText = (TextView) findViewById(R.id.inputText);
//        putText.setText(R.string.input_text);

//        Button helloWorldButton = (Button) findViewById(R.id.action_test_button_2);
//        helloWorldButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView helloWorld = (TextView)findViewById(R.id.textView3);
//                helloWorld.setText("Hello world!");
//                Log.e(
//                        TAG, "Just logs for practise"
//                );
//            }
//        });
    }

    public void displayNewText(View view) {
        TextView helloWorld = (TextView)findViewById(R.id.textView3);
        helloWorld.setText("Idk why you want smth else");
        Log.e(
                TAG, "Just logs for practise"
        );
    }

    public void goToRegistration(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}