package com.example.hpfolio.serviceapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);


        Button btnStart = (Button)findViewById(R.id.btnStart);
       Button btnStop = (Button)findViewById(R.id.btnStop);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playIntent = new Intent(MediaActivity.this,MainActivity.class);
                startService(playIntent);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent stopIntent = new Intent(MediaActivity.this,MainActivity.class);
                stopService(stopIntent);
            }
        });
    }
}
