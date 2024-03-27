package com.example.breakdownassistanceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.breakdownassistanceapp.Adapter.EmergencyListAdapter;
import com.example.breakdownassistanceapp.Adapter.EmergencyListItem;

import java.util.ArrayList;
import java.util.List;


public class EmergencyListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EmergencyListAdapter adapter;
    private List<EmergencyListItem> emergencyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_list);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new EmergencyListAdapter(emergencyList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        addEmergencyItem("Med-Kit");
        addEmergencyItem("Flashlight");
        addEmergencyItem("Water");
        addEmergencyItem("Food");
        addEmergencyItem("Lighter");
        addEmergencyItem("Fire-starter");
        addEmergencyItem("Tent");
        addEmergencyItem("Blanket");

    }

    private void addEmergencyItem(String text) {
        EmergencyListItem item = new EmergencyListItem(text);
        emergencyList.add(item);
        adapter.notifyDataSetChanged();
    }
}