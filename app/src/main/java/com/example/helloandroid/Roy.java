package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Roy extends AppCompatActivity {
    Button hello;
    TextView hey;
    String message = "lets win those stickers ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roy);

        hello = findViewById(R.id.button);
        hey = findViewById(R.id.textView);


        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hey.setText("Roy created this");
                Toast.makeText(Roy.this,message.toString()+"> Made By Roy Nyamhute",Toast.LENGTH_LONG).show();
            }
        });
    }
}
