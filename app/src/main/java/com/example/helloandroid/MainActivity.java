package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button hello;
    TextView hey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = findViewById(R.id.button);
        hey = findViewById(R.id.textView);
        String message = "lets win those stickers ";

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hey.setText("");
                Toast.makeText(MainActivity.this,"Team Git hub",Toast.LENGTH_LONG).show();
            }
        });


    }

}


