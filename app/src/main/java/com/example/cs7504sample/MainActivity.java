package com.example.cs7504sample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button2;
    Button button3;
    TextView txtvw;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        txtvw = findViewById(R.id.txtvw);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            txtvw.setText("button is clicked");
        }
        if (v.getId() == R.id.button2) {
            txtvw.setText("Button 2 is clicked");
        }
        if (v.getId() == R.id.button3) {
            txtvw.setText("Button 3 is clicked");
        }
    }
}
