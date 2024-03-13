package com.example.phonebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.phonebook.databinding.ActivityAddContactBinding;

import java.util.ArrayList;

public class AddContactActivity extends MainActivity {
    ActivityAddContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setVariable();
    }

    private void setVariable(){
        binding.textSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editName.getText().toString();
                String phone = binding.editPhone.getText().toString();
                String email = binding.editEmail.getText().toString();
                Contacts contact = new Contacts(name, phone, email);
                addItem(contact);
            }
        });
    }
}

