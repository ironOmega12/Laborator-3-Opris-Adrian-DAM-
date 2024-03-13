package com.example.phonebook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.phonebook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    static final ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    public ContactAdapter contactListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setVariable();

        contactListAdapter = new ContactAdapter(this, contacts);

        ListView contactListView = findViewById(R.id.listView);

        contactListView.setAdapter(contactListAdapter);
    }

    private void setVariable() {
        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });
        binding.searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Contacts ct: contacts){
                    System.out.println(ct.getName());
                }
            }
        });
    }
    public void addItem(Contacts contact){
        contacts.add(contact);
        contactListAdapter.notifyDataSetChanged();
    }
    protected void onResume() {
        super.onResume();
        contactListAdapter.notifyDataSetChanged();
    }
}