package com.example.phonebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter  extends ArrayAdapter<Contacts> {
    public ContactAdapter(@NonNull Context context, ArrayList<Contacts> arrayList) {
        super(context, 0, arrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.contact_item, parent, false);
        }

        Contacts currentContactPos = getItem(position);

        assert currentContactPos != null;

        TextView nameText = currentItemView.findViewById(R.id.nameTxt);
        nameText.setText(currentContactPos.getName());

        TextView phoneText = currentItemView.findViewById(R.id.phoneTxt);
        phoneText.setText(currentContactPos.getPhone());

        TextView emailText = currentItemView.findViewById(R.id.emailTxt);
        emailText.setText(currentContactPos.getEmail());

        return currentItemView;
    }
}
