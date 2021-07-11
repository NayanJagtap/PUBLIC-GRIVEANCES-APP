package com.example.managing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

public class managementpg4 extends AppCompatActivity {
    NumberPicker mum3;
    MediaPlayer bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managementpg4);
        mum3=(NumberPicker)findViewById(R.id.numberPicker3);
        bt3= MediaPlayer.create(this,R.raw.mouseclick);
        String string3[]={
                "lohegaon",
                "Ambegaon",
                "Aundh",
                "Baner",
                "Bavdhan Khurd",
                "Bavdhan Budruk",
                "Balewadi",
                "Bhamburde (now called Shivajinagar)",
                "Bibvewadi",
                "Bhugaon",
                "Bhukum",
                "Dhankawadi",
                "Dhanori",
                "Dhayari",
                "Erandwane",
                "Fursungi",
                "Ghorpadi",
                "Hadapsar",
                "Hingne Khurd",
                "Karve Nagar",
                "Kalas",
                "Katraj",
                "Khadki",
                "Kharadi",
                "Kondhwa",
                "Koregaon Park",
                "Kothrud",
                "Manjri",
                "Markal",
                "Mohammed Wadi",
                "Mundhwa",
                "Nanded",
                "Parvati",
                "Panmala",
                "Pashan",
                "Pirangut",
                "Shivane",
                "Sus",
                "Undri",
                "Vishrantwadi",
                "Vitthalwadi",
                "Vadgaon Khurd",
                "Vadgaon Budruk",
                "Vadgaon Sheri",
                "Wagholi",
                "Wanowrie",
                "Warje",
                "Yerwada,"
        };
        mum3.setDisplayedValues(string3);
        mum3.setMinValue(0);
        mum3.setMaxValue(string3.length-1);


    }
    public void buttton3(View view)
    {   bt3.start();
        int choice3=mum3.getValue();
        if(choice3==0)
        {
            Intent gotosixth= new Intent();
            gotosixth.setClass(this,managementpg5.class);
            startActivity(gotosixth);
        }
        else
        {
            Toast.makeText(this, "SELECT ONLY LOHEGAON AS LOHEGAON IS ONLY AVAILABLE AS PER NOW", Toast.LENGTH_SHORT).show();
        }
    }
}