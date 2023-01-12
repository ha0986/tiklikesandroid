package com.hanif.tiklikes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move();
        autoLoad.loadAdd(this);
    }

    public void move() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String username = pref.getString("name", "");
        autoLoad.followed = pref.getString("done", "");
        if (Objects.equals(username, "")) {
            Intent myIntent = new Intent(MainActivity.this, login.class);
            startActivity(myIntent);
        } else {

            autoLoad.userName = username;
            autoLoad.getdata();
            Intent myIntent = new Intent(MainActivity.this, doTask.class);
            startActivity(myIntent);
        }
    }


}