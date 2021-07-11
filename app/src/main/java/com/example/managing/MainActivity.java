package com.example.managing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    MediaPlayer bt,rock;
    ImageButton bt0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=MediaPlayer.create(this,R.raw.mouseclick);
        TextView textView=findViewById(R.id.textViewmarquee);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        bt0=(ImageButton)findViewById(R.id.imageButton2);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://public-grievance-project.web.app/");
            }
        });
        rock=MediaPlayer.create(MainActivity.this,R.raw.rockstarmusic);
        rock.setLooping(true);
        rock.start();


    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void button4 (View view){
        bt.start();
        rock.stop();
        Intent gotomanagingpg2= new Intent();
        gotomanagingpg2.setClass(this,managementpg2.class);
        startActivity(gotomanagingpg2);

    }

}