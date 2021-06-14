package com.example.deltaappdevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Endpage extends AppCompatActivity {
    public int finalScore = Questions.points;
    public TextView finalPoints;
    public Button homebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endpage);
        final Vibrator vibe = (Vibrator) Endpage.this.getSystemService(Context.VIBRATOR_SERVICE);
        finalPoints=findViewById(R.id.finalScore);
        finalPoints.setText(String.valueOf(finalScore));
        homebutton=findViewById(R.id.homebutton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                homepage();
            }
        });
    }
    int click=0;

    @Override
    public void onBackPressed(){
        click++;
        if(click==100){
            super.onBackPressed();
        }
    }

    public void homepage(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}