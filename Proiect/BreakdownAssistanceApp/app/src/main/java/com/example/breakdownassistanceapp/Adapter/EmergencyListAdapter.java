package com.example.breakdownassistanceapp.Adapter;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breakdownassistanceapp.R;

import java.util.List;

public class EmergencyListAdapter extends RecyclerView.Adapter<EmergencyListAdapter.ViewHolder> {
    private List<EmergencyListItem> emergencyList;

    public EmergencyListAdapter(List<EmergencyListItem> emergencyList) {
        this.emergencyList = emergencyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_emergency_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EmergencyListItem item = emergencyList.get(position);
        holder.textView.setText(item.getEmergencyText());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.textView.setPaintFlags(holder.textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

            }
        });
    }

    @Override
    public int getItemCount() {
        return emergencyList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView3);
            button = itemView.findViewById(R.id.checkedBtn);
        }
    }
}
