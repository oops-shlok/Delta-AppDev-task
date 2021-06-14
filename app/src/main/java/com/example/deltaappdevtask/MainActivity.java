package com.example.deltaappdevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Vibrator vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                vibe.vibrate(100);
                openquestion();
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


    public void openquestion(){
        Intent intent=new Intent(this,Questions.class);
        startActivity(intent);
    }
}