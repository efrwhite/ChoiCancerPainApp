package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {



    public static String fName = "";
    public static String lName = "";

    public static String gender = "";
    public static String ethnicity = "";

    public static String CancerDetected = "";

    public static String OtherConditions ="";
    public static String PastPainTreatment ="";
    public static String CurrentPainTreatment ="";
    public static String PastUseDrugs ="";
    public static String CurrentUseDrugs ="";
    public static String AbusePersonalHistory ="";
    public static String AbuseFamilyHistory ="";
    public static String AbuseSexualHistory ="";

    public static String emailid = "";
    public static String DOB ="";

    public static String PainTreatGoal = "";
    public static String PainTreatPref = "";

    public static String CollectionData = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        Button userInfo = (Button) findViewById(R.id.button2);
        Button painEpisode = (Button) findViewById(R.id.button);


        userInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadUserInfoActivity();
            }
        });
        painEpisode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadPainEpisodeActivity();
            }
        });



    }

    private void loadUserInfoActivity()
    {
        Intent intent = new Intent(StartPage.this, StartPage.class);
        startActivity(intent);
    }
    private void loadPainEpisodeActivity()
    {
        Intent intent = new Intent(StartPage.this, StartPage.class);
        startActivity(intent);
    }
}

