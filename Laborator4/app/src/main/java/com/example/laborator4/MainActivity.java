package com.example.laborator4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textNo1 = findViewById(R.id.txtFirstNo);
        EditText textNo2 = findViewById(R.id.txtSecondNo);
        TextView textResult = findViewById(R.id.txtResult);
        ImageView plusBtn = findViewById(R.id.plusButton);
        ImageView minusBtn = findViewById(R.id.minusButton);
        ImageView timesBtn = findViewById(R.id.oriButton);
        ImageView divBtn = findViewById(R.id.divButton);

        plusBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String stringValueNo1 = textNo1.getText().toString();
                int no1 = Integer.parseInt(stringValueNo1);
                String stringValueNo2 = textNo2.getText().toString();
                int no2 = Integer.parseInt(stringValueNo2);
                int res = no1 + no2;
                textResult.setText(String.valueOf(res));
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String stringValueNo1 = textNo1.getText().toString();
                int no1 = Integer.parseInt(stringValueNo1);
                String stringValueNo2 = textNo2.getText().toString();
                int no2 = Integer.parseInt(stringValueNo2);
                int res = no1 - no2;
                textResult.setText(String.valueOf(res));
            }
        });
        timesBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String stringValueNo1 = textNo1.getText().toString();
                int no1 = Integer.parseInt(stringValueNo1);
                String stringValueNo2 = textNo2.getText().toString();
                int no2 = Integer.parseInt(stringValueNo2);
                int res = no1 * no2;
                textResult.setText(String.valueOf(res));
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String stringValueNo1 = textNo1.getText().toString();
                int no1 = Integer.parseInt(stringValueNo1);
                String stringValueNo2 = textNo2.getText().toString();
                int no2 = Integer.parseInt(stringValueNo2);
                int res = no1 / no2;
                textResult.setText(String.valueOf(res));
            }
        });
    }
}