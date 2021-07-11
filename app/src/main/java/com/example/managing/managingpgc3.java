package com.example.managing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

public class managingpgc3 extends AppCompatActivity {
    NumberPicker num1;
    MediaPlayer bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managingpgc3);
        num1=(NumberPicker)findViewById(R.id.numberPicker2);
        bt2= MediaPlayer.create(this,R.raw.mouseclick);
        String string2[]={
                "Pune",
                "Ahmednagar",
                "Akola",
                "Amravati",
                "Aurangabad",
                "Beed",
                "Bhandara",
                "Buldhana",
                "Chandrapur",
                "Dhule",
                "Gadchiroli",
                "Gondia",
                "Hingoli",
                "Jalgaon",
                "Jalna",
                "Kolhapur",
                "Latur",
                "Mumbai City",
                "Mumbai Subarban",
                "Nagpur",
                "Nanded",
                "Nandurbar",
                "Nashik",
                "Osmanabad",
                "Palghar",
                "Parbhani",
                "Raigad",
                "Ratnagiri",
                "Sangli",
                "Satara",
                "Sindhudurg",
                "Solapur",
                "Thane",
                "Wardha",
                "Washim",
                "Yavatmal",
        };
        num1.setDisplayedValues(string2);
        num1.setMinValue(0);
        num1.setMaxValue(string2.length-1);
    }
    public void button2(View view)
    {
        bt2.start();
        int choice1=num1.getValue();
        if(choice1==0)
        {
            Intent gotofourth= new Intent();
            gotofourth.setClass(this,managementpg4.class);
            startActivity(gotofourth);
        }
        else
        {
            Toast.makeText(this, "PLEASE ENTER PUNE AS DISTRICT ONLY AS PER NOW ONLY PUNE IS AVAILABLE", Toast.LENGTH_SHORT).show();
        }
    }
}