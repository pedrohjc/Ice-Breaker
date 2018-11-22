package com.example.android.icebreakerv10;

import android.support.v7.app.AppCompatActivity;

public class User extends AppCompatActivity {

    private String mName,mLastName, mCity;
    private int mAge;

    public User(){
        mAge = 0;
        mName = "Null";
        mLastName = "Null";
        mCity = "Null";
    }

    public User(String name, String last, String city, int age){
        mAge = age;
        mName = name;
        mLastName = last;
        mCity = city;
    }
}
