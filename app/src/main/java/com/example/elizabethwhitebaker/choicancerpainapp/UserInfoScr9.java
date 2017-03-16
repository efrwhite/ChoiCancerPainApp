package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoScr9 extends AppCompatActivity {
    public static String FileName;

    TextView thankyou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr9);
        thankyou =(TextView)findViewById(R.id.textView21);



        Button EndBtn = (Button)findViewById(R.id.button3);

        EndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstScreen.CollectionData = FirstScreen.fName +"\n"+ FirstScreen.lName +"\n"+ FirstScreen.gender +"\n"+ FirstScreen.ethnicity +"\n"+ FirstScreen.CancerDetected +"\n"+ FirstScreen.OtherConditions +"\n"+ FirstScreen.PastPainTreatment  +"\n"+ FirstScreen.CurrentPainTreatment  +"\n"+ FirstScreen.PastUseDrugs  +"\n"+ FirstScreen.CurrentUseDrugs  +"\n"+ FirstScreen.AbusePersonalHistory  +"\n"+ FirstScreen.AbuseFamilyHistory +"\n"+ FirstScreen.AbuseSexualHistory +"\n" + FirstScreen.DOB +"\n" + FirstScreen.PainTreatGoal +"\n" + FirstScreen.PainTreatPref;
                Intent intent = new Intent(UserInfoScr9.this, FirstScreen.class);
                startActivity(intent);
            }
        });

        Button GenBtn = (Button)findViewById(R.id.button4);

        GenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstScreen.CollectionData = FirstScreen.fName +"\n"+ FirstScreen.lName +"\n"+ FirstScreen.gender +"\n"+ FirstScreen.ethnicity +"\n"+ FirstScreen.CancerDetected +"\n"+ FirstScreen.OtherConditions +"\n"+ FirstScreen.PastPainTreatment  +"\n"+ FirstScreen.CurrentPainTreatment  +"\n"+ FirstScreen.PastUseDrugs  +"\n"+ FirstScreen.CurrentUseDrugs  +"\n"+ FirstScreen.AbusePersonalHistory  +"\n"+ FirstScreen.AbuseFamilyHistory +"\n"+ FirstScreen.AbuseSexualHistory +"\n" + FirstScreen.DOB +"\n" + FirstScreen.PainTreatGoal +"\n" + FirstScreen.PainTreatPref;
                UserInfoScr9.FileName = FirstScreen.fName +"_"+ FirstScreen.lName+"_"+FirstScreen.emailid;

                try {
                    FileOutputStream fileOutputStream = openFileOutput(UserInfoScr9.FileName, MODE_PRIVATE);

                    fileOutputStream.write(FirstScreen.CollectionData.getBytes());

                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                thankyou.setText(FirstScreen.CollectionData);
            }

            public void readMessage()
            {
                try {

                    String MessageFetched;
                    FileInputStream fileInputStream = openFileInput(UserInfoScr9.FileName);
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuffer stringBuffer = new StringBuffer();

                    while((MessageFetched = bufferedReader.readLine())!= null)
                    {
                        stringBuffer.append(MessageFetched +"\n");

                    }

                    String FinalMsg = stringBuffer.toString();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });

    }
}
