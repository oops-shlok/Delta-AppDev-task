package com.example.deltaappdevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.GregorianCalendar;


public class Questions extends AppCompatActivity {

    TextView dateGenerator;
    Button next;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    public TextView updateScore;
    public static int i;
    public static String week[]={"0","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static int dayName;
    public static int j;
    public static int l;
    public static int m;
    public static int points;
    public View view;
    public Vibrator vibe;
    LinearLayout bg=(LinearLayout) findViewById(R.id.backgroundColor);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        dateGenerator = (TextView) findViewById(R.id.dateGenerator);
        updateScore = (TextView) findViewById(R.id.score);
        next=(Button) findViewById(R.id.next);
        option1=(Button) findViewById(R.id.option1);
        option2=(Button) findViewById(R.id.option2);
        option3=(Button) findViewById(R.id.option3);
        option4=(Button) findViewById(R.id.option4);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                points=0;
                dateGenerator.setText(generateDate());
                generateOption();
                solution();
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

    public String generateDate(){
        GregorianCalendar calender= new GregorianCalendar();

        int year=randBetween(1900,2030);
        calender.set(GregorianCalendar.YEAR,year);

        int day=randBetween(1,calender.getActualMaximum(GregorianCalendar.DAY_OF_YEAR));
        calender.set(GregorianCalendar.DAY_OF_YEAR,day);

        dayName=calender.get(GregorianCalendar.DAY_OF_WEEK);

        return calender.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(calender.get(GregorianCalendar.MONTH)+1)+"/"+calender.get(GregorianCalendar.YEAR);



    }


    private static int randBetween(int start,int end){
        return start + (int) Math.round(Math.random()*(end-start));
    }

    private void generateOption(){
        do{
            j=randBetween(1,7);
        }
        while(j==dayName);
        do{
            l=randBetween(1,7);
        }
        while(l==dayName || l==j );
        do{
            m=randBetween(1,7);
        }
        while(m==dayName || m==j || m==l );
        i=randBetween(1,4);
        switch(i){
            case 1:{
                option1.setText(week[dayName]);
                option2.setText(week[j]);
                option3.setText(week[l]);
                option4.setText(week[m]);

            }
            break;
            case 2:{
                option1.setText(week[j]);
                option2.setText(week[dayName]);
                option3.setText(week[l]);
                option4.setText(week[m]);
            }
            break;
            case 3:{
                option1.setText(week[j]);
                option2.setText(week[l]);
                option3.setText(week[dayName]);
                option4.setText(week[m]);
            }
            break;
            case 4:{
                option1.setText(week[j]);
                option2.setText(week[l]);
                option3.setText(week[m]);
                option4.setText(week[dayName]);
            }
            break;

        }
    }

    public void solution(){
        switch(i){
            case 1:{
                option1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        points=points+1;
                        updateScore.setText(String.valueOf(points));
                        bg.setBackgroundColor(Color.rgb(0,255,0));

                        dateGenerator.setText(generateDate());
                        generateOption();
                        solution();
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });

            }
            break;
            case 2:{
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        points=points+1;
                        updateScore.setText(String.valueOf(points));
                        bg.setBackgroundColor(Color.rgb(0,255,0));

                        dateGenerator.setText(generateDate());
                        generateOption();
                        solution();
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
            }
            break;
            case 3:{
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        points=points+1;
                        updateScore.setText(String.valueOf(points));
                        bg.setBackgroundColor(Color.rgb(0,255,0));

                        dateGenerator.setText(generateDate());
                        generateOption();
                        solution();
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });

            }
            break;
            case 4:{
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bg.setBackgroundColor(Color.rgb(255,0,0));
                        updateScore.setText(String.valueOf(points));
                        finish();
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        points=points+1;
                        updateScore.setText(String.valueOf(points));
                        bg.setBackgroundColor(Color.rgb(0,255,0));

                        dateGenerator.setText(generateDate());
                        generateOption();
                        solution();
                    }
                });

            }
            break;
        }
    }

    public void finish(){
        Intent intent=new Intent(this,Endpage.class);
        startActivity(intent);
    }

}
