package com.hanif.tikfollow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;

import java.util.ArrayList;

public class task extends AppCompatActivity implements View.OnClickListener {
    public Intent myIntent;
    TextView userpoints;
    public String minusUser;
    public Integer minusPoint;
    public Integer plusPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        Button reward = findViewById(R.id.reward200);
        Button back = findViewById(R.id.back);
        Button jokes = findViewById(R.id.jokes);
        Button follow = findViewById(R.id.follow);
        userpoints = findViewById(R.id.taskpoint);

        reward.setOnClickListener(this);
        back.setOnClickListener(this);
        jokes.setOnClickListener(this);
        follow.setOnClickListener(this);


        autoLoad.getkeys();

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.reward200:
                autoLoad.loadReward(task.this);
            case  R.id.jokes:
                myIntent = new Intent(task.this, jokes.class);
                startActivity(myIntent);
            case R.id.back:
                myIntent = new Intent(task.this, profile.class);
                startActivity(myIntent);
            case R.id.follow:


        }
    }






    public void savedata(){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);

        SharedPreferences.Editor editor = pref.edit();

    }










}