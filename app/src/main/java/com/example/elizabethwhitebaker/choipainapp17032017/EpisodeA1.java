package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;

public class EpisodeA1 extends AppCompatActivity {
    public static String PainLevel = " ";
    public static String TypeOfPain = " ";
    public static String PainId = " ";
    public static String PainRel= " ";
    public static String PainUpdate = " ";
    public static String PainFeelLike = " ";
    public static String PainStart = " ";
    public static String PainLastHour = " ";
    public static String PainLastMin = " ";
    public static String PainChanges = " ";
    public static String PainBOW = " ";
    public static String PainDON = " ";
    public static String PainSymptoms = " ";
    public static String PainDailyAct = " ";
    public static String PainManageBT = " ";
    public static String PrefAltTher = " ";
    public static String BodyFront = " ";
    public static String BodyBack = " ";
    public static String CollectiveData = " ";
    public static String TreatApproach = " ";


    SeekBar sb1;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button next;
    Button prev;
    Spinner spn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a1);
        next = (Button)findViewById(R.id.nextButtonE1);
        prev = (Button)findViewById(R.id.prevButtonE1);
        spn1 = (Spinner)findViewById(R.id.spinner3E1);
        sb1 = (SeekBar)findViewById(R.id.seekBarA1);




        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.TypeOfPain=spn1.getSelectedItem().toString();
                float a =(((float) sb1.getProgress()) / ((float)  sb1.getMax())*10);
                int b = (int) (a);

                String ab = String.valueOf(b);
                EpisodeA1.PainLevel = ab;


                Intent intent = new Intent(EpisodeA1.this, EpisodeA2.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA1.this, StartPage.class);
                startActivity(intent);
            }
        });





    }
}