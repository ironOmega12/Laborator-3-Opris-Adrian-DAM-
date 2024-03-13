package com.example.ex1lab;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPorsche;
    Button btnGoogle;
    Button btnStray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPorsche = findViewById(R.id.btnPorsche);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnStray = findViewById(R.id.btnStray);

        btnPorsche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ("https://www.porsche.com/central-eastern-europe/en/_romania_/");
                Intent intent  = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ("https://www.google.com/");
                Intent intent  = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        btnStray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ("https://store.steampowered.com/app/1332010/Stray/");
                Intent intent  = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}