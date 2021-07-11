package com.example.managing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class managementpg5 extends AppCompatActivity {
    EditText edtphone, edtmessage;
    Button btsend;
    MediaPlayer bt5;
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
                Toast.makeText(managementpg5.this, "YOU HAVE CHOOSE" + txt, Toast.LENGTH_SHORT).show();
                EditText editText = null;
                EditText editText2 = null;
                TextView textView = null;
                editText = (EditText) findViewById(R.id.phonenumber);
                textView = (TextView) findViewById(R.id.textView2);
                editText2 = (EditText) findViewById(R.id.message);

                if (position == 1) {
                    editText.setText("9021478995");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY NAYAN JAGTAP" +
                            "\nAND YOUR MESSAGE WILL GO IN SEWAGE DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 2) {
                    editText.setText("7666199875");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY MONALISA NAYAK" +
                            "\nAND YOUR MESSAGE WILL GO IN WATER DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 3) {
                    editText.setText("8329596650");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY AMAN SINGH" +
                            "\nAND YOUR MESSAGE WILL GO IN LIGHT DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 4) {
                    editText.setText("9834467443");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY MINKU SINGH" +
                            "\nAND YOUR MESSAGE WILL GO IN MEDICAL DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 5) {
                    editText.setText("9021478995");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY NAYAN JAGTAP" +
                            "\nAND YOUR MESSAGE WILL GO IN CORRUPTION HANDLING DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 6) {
                    editText.setText("7666199875");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY MONALISA NAYAK" +
                            "\nAND YOUR MESSAGE WILL GO IN FRAUD HANDLING DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 7) {
                    editText.setText("8329596650");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY AMAN SINGH" +
                            "\nAND YOUR MESSAGE WILL GO IN CYBER DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 8) {
                    editText.setText("9834467443");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY MINKU SINGH" +
                            "\nAND YOUR MESSAGE WILL GO IN LADIES AND CHILD PROTECTION DEPARTMENT");
                    editText2.setText(null);

                }
                if (position == 9) {
                    editText.setText("9021478995");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY NAYAN JAGTAP" +
                            "\nAND YOUR MESSAGE WILL GO IN ROAD DEPARTMENT");
                    editText2.setText(null);
                }
                if (position == 10) {
                    editText.setText("9021478995");
                    textView.setText("YOUR MESSAGE WILL BE RECIVED BY NAYAN JAGTAP" +
                            "\nAND YOUR MESSAGE WILL GO IN CHILD-LABOUR DEPARTMENT");
                    editText2.setText(null);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        edtphone = findViewById(R.id.phonenumber);
        edtmessage = findViewById(R.id.message);
        btsend = findViewById(R.id.send);
        bt5 = MediaPlayer.create(this, R.raw.mouseclick);
        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(managementpg5.this, Manifest.permission.SEND_SMS)
                        == PackageManager.PERMISSION_GRANTED) {
                    sendMessages();
                } else {
                    ActivityCompat.requestPermissions(managementpg5.this, new String[]{Manifest.permission.SEND_SMS}
                            , 100);
                }

            }
        });
    }

    private void sendMessages() {
        String sphone = edtphone.getText().toString().trim();
        String smessage = edtmessage.getText().toString().trim();
        if (!sphone.equals("") && !smessage.equals("")) {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(sphone, null, smessage, null, null);
            //display toast
            Toast.makeText(getApplicationContext(), "SMS SENT TO NAYAN !!", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "ENTER VALUE FIRST ", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            sendMessages();
        } else {
            Toast.makeText(getApplicationContext(), "Permission Denied", Toast.LENGTH_SHORT).show();
        }
    }

}