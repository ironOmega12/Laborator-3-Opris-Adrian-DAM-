package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstUser extends AppCompatActivity {
    public static final ArrayList<Messages> messages = new ArrayList<Messages>();
    ImageView sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_user);


        MessagesAdapter msgArrayAdapter = new MessagesAdapter(this, messages);
        ListView msgListView = findViewById(R.id.listView);
        msgListView.setAdapter(msgArrayAdapter);

        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text1 = findViewById(R.id.writeTextBox);
                String message = text1.getText().toString();
                String recipient = "User 1: ";
                messages.add(new Messages(message, recipient, 1));
                msgArrayAdapter.notifyDataSetChanged();
            }
        });
    }
}