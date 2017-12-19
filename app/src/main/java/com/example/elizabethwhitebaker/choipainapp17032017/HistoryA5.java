package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class HistoryA5 extends AppCompatActivity {

    Spinner PPT;
    Spinner CPT;

    EditText PPT1;
    EditText CPT1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a5);
        PPT = (Spinner)findViewById(R.id.spinnera5);
        CPT = (Spinner)findViewById(R.id.spinner2a5);
        PPT1 = (EditText)findViewById(R.id.editText7a5);
        CPT1 = (EditText)findViewById(R.id.editText8a5);




        Button nextButton = (Button)findViewById(R.id.nextButtonHA5);
        Button prevButton = (Button)findViewById(R.id.prevButtonHA5);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PPTtext="";
                if(PPT.getSelectedItem().toString() == "Other:indicate")
                {
                    StartPage.PastPainTreatment =PPT1.getText().toString();
                }
                else
                {
                    StartPage.PastPainTreatment = PPT.getSelectedItem().toString();
                }

                if(CPT.getSelectedItem().toString() == "Other:indicate")
                {
                    StartPage.CurrentPainTreatment =CPT1.getText().toString();
                }
                else
                {
                    StartPage.CurrentPainTreatment = CPT.getSelectedItem().toString();
                }


                Intent intent = new Intent(HistoryA5.this, HistoryA6.class);
                startActivity(intent);
            }




        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA5.this, HistoryA4.class);
                startActivity(intent);

            }
        });





    }
}

