package com.example.laborator3oprisadrian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count = 0;
    public void btnClick(View view){
        TextView txtNumber = findViewById(R.id.txtNumber);
        count++;
        txtNumber.setText(String.valueOf(count));
    }
    public void toastOnClick(View view){
        TextView txtToast = findViewById(R.id.txtNumber);
        txtToast.setText("Toast!");
    }
}