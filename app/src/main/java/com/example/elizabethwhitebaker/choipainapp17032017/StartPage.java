package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.FileInputStream;
import java.io.InputStreamReader;

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

    public static String Check = "";
    public static String Check2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        Button userInfo = (Button) findViewById(R.id.button);
        Button painEpisode = (Button) findViewById(R.id.button2);
        Button sendEmail = (Button) findViewById(R.id.button3);
        Button viewData = (Button)findViewById(R.id.button5);

        try {
            FileInputStream fileIn=openFileInput("Episodes.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[256];
            String s1="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s1 +=readstring;
            }
            InputRead.close();
            //test.setText(s);

            StartPage.Check2 = s1;

            //Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }





        try {
            FileInputStream fileIn=openFileInput("History.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[256];
            String s="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            //test.setText(s);

            StartPage.Check = s;

            //Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }





        if(Check == "")
        {
            userInfo.setVisibility(View.VISIBLE);
            painEpisode.setVisibility(View.INVISIBLE);

        }
        else
        {
            userInfo.setVisibility(View.INVISIBLE);
            painEpisode.setVisibility(View.VISIBLE);


        }
        if(Check2 == "")
        {
            sendEmail.setVisibility(View.INVISIBLE);

        }
        else
        {
            sendEmail.setVisibility(View.VISIBLE);

        }




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


        viewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(StartPage.this, ViewEpisodeData.class);
                startActivity(intent);


            }
        });
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"swanandn1993@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{"swanandinaction@gmail.com"});
//                emailIntent.putExtra(Intent.EXTRA_BCC, new String[]{"swanandinaction@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject: Data for pain application");
                emailIntent.putExtra(Intent.EXTRA_TEXT, StartPage.Check2);

                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "Choose email client... "));









            }
        });


    }


    private void loadUserInfoActivity()
    {
        Intent intent = new Intent(StartPage.this, HistoryA1.class);
        startActivity(intent);
    }
    private void loadPainEpisodeActivity()
    {
        Intent intent = new Intent(StartPage.this, EpisodeA1.class);
        startActivity(intent);
    }





}
