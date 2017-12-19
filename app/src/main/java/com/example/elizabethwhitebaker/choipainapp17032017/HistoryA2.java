package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class HistoryA2 extends AppCompatActivity {

    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    CheckBox chk4;
    CheckBox chk5;
    CheckBox chk6;
    CheckBox chk7;
    CheckBox chk8;
    CheckBox chk9;
    CheckBox chk10;
    CheckBox chk11;
    CheckBox chk12;
    CheckBox chk13;
    CheckBox chk14;
    CheckBox chk15;
    CheckBox chk16;
    CheckBox chk18;
    EditText othrTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a2);


        chk1 =(CheckBox)findViewById(R.id.checkBox);
        chk2 = (CheckBox)findViewById(R.id.checkBox2);
        chk3 = (CheckBox)findViewById(R.id.checkBox3);
        chk4 = (CheckBox)findViewById(R.id.checkBox4);
        chk5 = (CheckBox)findViewById(R.id.checkBox5);
        chk6 = (CheckBox)findViewById(R.id.checkBox6);
        chk7 = (CheckBox)findViewById(R.id.checkBox7);
        chk8 = (CheckBox)findViewById(R.id.checkBox8);
        chk9 = (CheckBox)findViewById(R.id.checkBox9);
        chk10 = (CheckBox)findViewById(R.id.checkBox10);
        chk11 = (CheckBox)findViewById(R.id.checkBox11);
        chk12 = (CheckBox)findViewById(R.id.checkBox12);
        chk13 = (CheckBox)findViewById(R.id.checkBox13);
        chk14 = (CheckBox)findViewById(R.id.checkBox14);
        chk15 = (CheckBox)findViewById(R.id.checkBox15);
        chk16 = (CheckBox)findViewById(R.id.checkBox16);
        chk18 = (CheckBox)findViewById(R.id.checkBox18);
        othrTxt = (EditText)findViewById(R.id.editText4);

        Button previousButton = (Button) findViewById(R.id.prevButtonHA2);
        Button nextButton = (Button) findViewById(R.id.nextButtonHA2);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cancersDetected = "";

                if(chk1.isActivated())
                {
                    cancersDetected = cancersDetected + chk1.getText().toString()+",";
                }
                if(chk2.isActivated())
                {
                    cancersDetected = cancersDetected + chk2.getText().toString()+",";
                }
                if(chk3.isActivated())
                {
                    cancersDetected = cancersDetected + chk3.getText().toString()+",";
                }
                if(chk4.isActivated())
                {
                    cancersDetected = cancersDetected + chk4.getText().toString()+",";
                }
                if(chk5.isActivated())
                {
                    cancersDetected = cancersDetected + chk5.getText().toString()+",";
                }
                if(chk6.isActivated())
                {
                    cancersDetected = cancersDetected + chk6.getText().toString()+",";
                }
                if(chk7.isActivated())
                {
                    cancersDetected = cancersDetected + chk7.getText().toString()+",";
                }
                if(chk8.isActivated())
                {
                    cancersDetected = cancersDetected + chk8.getText().toString()+",";
                }
                if(chk10.isActivated())
                {
                    cancersDetected = cancersDetected + chk10.getText().toString()+",";
                }
                if(chk11.isActivated())
                {
                    cancersDetected = cancersDetected + chk11.getText().toString()+",";
                }
                if(chk12.isActivated())
                {
                    cancersDetected = cancersDetected + chk12.getText().toString()+",";
                }
                if(chk13.isActivated())
                {
                    cancersDetected = cancersDetected + chk13.getText().toString()+",";
                }
                if(chk14.isActivated())
                {
                    cancersDetected = cancersDetected + chk14.getText().toString()+",";
                }
                if(chk15.isActivated())
                {
                    cancersDetected = cancersDetected + chk15.getText().toString()+",";
                }
                if(chk16.isActivated())
                {
                    cancersDetected = cancersDetected + chk16.getText().toString()+",";
                }

                if(chk18.isActivated())
                {
                    cancersDetected = cancersDetected + chk18.getText().toString()+",";
                }
                if(chk9.isActivated())
                {
                    cancersDetected = cancersDetected + othrTxt.getText().toString();
                }

                if(cancersDetected == "")
                {
                    cancersDetected = "None";
                }
                StartPage.CancerDetected = cancersDetected;


                Intent intent = new Intent(HistoryA2.this, HistoryA3.class);
                startActivity(intent);




            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA2.this, HistoryA1.class);
                startActivity(intent);

            }
        });







    }
}


