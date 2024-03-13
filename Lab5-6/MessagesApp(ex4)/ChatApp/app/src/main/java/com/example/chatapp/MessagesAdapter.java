package com.example.chatapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class MessagesAdapter extends ArrayAdapter<Messages> {
    public MessagesAdapter(@NonNull Context context, ArrayList<Messages> messageList){
        super(context, 0, messageList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_message, parent, false);
        }

        Messages currentNumberPosition = getItem(position);

        assert currentNumberPosition != null;

        TextView textView1 = currentItemView.findViewById(R.id.textView);
        textView1.setText(currentNumberPosition.getText());
        textView1.setTextColor(ContextCompat.getColor(getContext(), R.color.white));

        TextView txtName = currentItemView.findViewById(R.id.txtViewPerson);
        txtName.setText(currentNumberPosition.getRecipient());
        txtName.setTextColor(ContextCompat.getColor(getContext(), R.color.white));


        return currentItemView;
    }
}
