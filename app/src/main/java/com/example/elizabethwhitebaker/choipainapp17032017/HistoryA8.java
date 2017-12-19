package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class HistoryA8 extends AppCompatActivity {
    Context ctx = this;
    public static DatabaseOperations DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a8);

        Button goNext = (Button)findViewById(R.id.button3a8);

        goNext.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {

                StartPage.CollectionData = StartPage.fName + "\n" +StartPage.lName + "\n" +StartPage.gender + "\n" +StartPage.ethnicity + "\n" +StartPage.CancerDetected + "\n" +StartPage.OtherConditions + "\n" +StartPage.PastPainTreatment + "\n" +StartPage.CurrentPainTreatment + "\n" +StartPage.PastUseDrugs + "\n" +StartPage.CurrentUseDrugs + "\n" +StartPage.AbusePersonalHistory + "\n" +StartPage.AbuseFamilyHistory + "\n" +StartPage.AbuseSexualHistory + "\n" +StartPage.emailid + "\n" +StartPage.DOB + "\n" +StartPage.PainTreatGoal + "\n" +StartPage.PainTreatPref;


                //DATABASE

                DB = new DatabaseOperations(ctx);
                DB.putInformation(DB, StartPage.fName, StartPage.lName, StartPage.gender ,StartPage.ethnicity ,StartPage.CancerDetected ,StartPage.OtherConditions ,StartPage.PastPainTreatment ,StartPage.CurrentPainTreatment ,StartPage.PastUseDrugs ,StartPage.CurrentUseDrugs ,StartPage.AbusePersonalHistory ,StartPage.AbuseFamilyHistory ,StartPage.AbuseSexualHistory ,StartPage.emailid ,StartPage.DOB ,StartPage.PainTreatGoal ,StartPage.PainTreatPref);
                Toast.makeText(getBaseContext(), "row inserted 1", Toast.LENGTH_SHORT).show();





                try {
                    FileOutputStream fileout=openFileOutput("History.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                    outputWriter.write(StartPage.CollectionData);
                    outputWriter.close();

                    //display file saved message
                    Toast.makeText(getBaseContext(), "File saved successfully!",
                            Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }


                Intent intent = new Intent(HistoryA8.this, FirstIntro.class);
                startActivity(intent);
            }
        });



    }
}

