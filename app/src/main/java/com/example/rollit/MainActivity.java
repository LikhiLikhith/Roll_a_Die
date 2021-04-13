package com.example.rollit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img,re;
    Button btn;
    MediaPlayer mp;
    TextView tv;
    final int min = 1;
    final int max = 6;
    final int random = new Random().nextInt((max - min) + 1) + min;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img1);
        re = (ImageView) findViewById(R.id.reset);
        btn = (Button) findViewById(R.id.click);
        tv = (TextView) findViewById(R.id.txtshow);
        mp = MediaPlayer.create(this,R.raw.rolling);

    }

    public void rolled(View view) {

        if (random == 1) {
            img.setImageResource(R.drawable.one);

        } else if (random == 2) {
            img.setImageResource(R.drawable.two);

        } else if (random == 3) {
            img.setImageResource(R.drawable.three);

        } else if (random == 4) {
            img.setImageResource(R.drawable.four);

        } else if (random == 5) {
            img.setImageResource(R.drawable.five);

        } else if (random == 6) {
            img.setImageResource(R.drawable.six);

        }
        flag=1;
        mp.start();
        btn.setEnabled(false);
        tv.setVisibility(View.INVISIBLE);
        re.setVisibility(View.VISIBLE);
        btn.setText("Re-Set");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void replay(View view) {

        if (flag==1){
            recreate();
        }

    }
}