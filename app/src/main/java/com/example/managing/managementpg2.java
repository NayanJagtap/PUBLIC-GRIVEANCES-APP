package com.example.managing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

public class managementpg2 extends AppCompatActivity {
    NumberPicker mum1;
    MediaPlayer bt1,intheend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managementpg2);
        mum1=(NumberPicker)findViewById(R.id.numberPicker);
        bt1= MediaPlayer.create(this,R.raw.mouseclick);
        intheend=MediaPlayer.create(managementpg2.this,R.raw.intheend);
        intheend.setLooping(true);
        intheend.start();
        String string3[]={
                "Maharashtra",
                "Andhra Pradesh",
                "Arunachal Pradesh",
                "Assam",
                "Bihar",
                "Chhattisgarh",
                "Goa",
                "Gujarat",
                "Haryana",
                "Himachal Pradesh",
                "Jammu and Kashmir",
                "Jharkhand",
                "Karnataka",
                "Kerala",
                "Madhya Pradesh",
                "Manipur",
                "Meghalaya",
                "Mizoram",
                "Nagaland",
                "Odisha",
                "Punjab",
                "Rajasthan",
                "Sikkim",
                "Tamil Nadu",
                "Telangana",
                "Tripura",
                "Uttarakhand",
                "Uttar Pradesh",
                "West Bengal",
                "Andaman and Nicobar Islands",
                "Chandigarh",
                "Dadra and Nagar Haveli",
                "Daman and Diu",
                "Delhi",
                "Lakshadweep",
                "Puducherry"
        };
        mum1.setDisplayedValues(string3);
        mum1.setMinValue(0);
        mum1.setMaxValue(string3.length-1);


    }
    public void button1(View view)
    {   bt1.start();
        int choice3=mum1.getValue();
        if(choice3==0)
        {
            Intent gotothird= new Intent();
            gotothird.setClass(this,managingpgc3.class);
            startActivity(gotothird);
        }
        else
        {
            Toast.makeText(this, "SELECT ONLY MAHARASHTRA AS A STATE " +
                    "\n JAI MAHARASHTRA", Toast.LENGTH_SHORT).show();
        }
    }
}