package com.example.managing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class managementpg6 extends AppCompatActivity {
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managementpg5);
        String[] arr = new String[]
                {
                        "\n***CLICK HERE FOR YOUR PROBLEM***", "1)SEWAGE",
                        "2)WATER",
                        "3)LIGHT",
                        "4)MEDICAL",
                        "5)CORRUPTION",
                        "6)FRAUD",
                        "7)CYBERATTACK",
                        "8)RAPE",
                        "9)ROAD DAMAGED",
                        "10)CHILD LABOUR",
                };
        spn = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String txt = parent.getItemAtPosition(position).toString();
                Toast.makeText(managementpg6.this, "YOU HAVE CHOOSE" + txt, Toast.LENGTH_SHORT).show();
                if (position == 0) {

                } else {
                    Intent intent = new Intent(managementpg6.this, managementpg5.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
