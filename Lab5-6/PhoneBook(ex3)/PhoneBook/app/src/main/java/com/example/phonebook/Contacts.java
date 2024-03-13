package com.example.phonebook;

import android.os.Parcel;
import android.os.Parcelable;

public class Contacts  {
    private String name;
    private String email;
    private String phone;

    public Contacts(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


}
