package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class EpisodeA8 extends AppCompatActivity {





    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;
    CheckBox ch7;
    CheckBox ch8;
    EditText ed1;
    EditText ed2;
    String pSymptoms;
    String pDailyAct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a8);

        Button next = (Button)findViewById(R.id.nextButtonE8);
        Button prev = (Button)findViewById(R.id.prevButtonE8);
        rb1 = (RadioButton)findViewById(R.id.radioButton6E8);
        rb2 = (RadioButton)findViewById(R.id.radioButton7E8);
        rb3 = (RadioButton)findViewById(R.id.radioButton8E8);
        rb4 = (RadioButton)findViewById(R.id.radioButton9E8);
        ch1 = (CheckBox)findViewById(R.id.checkBox17E8);
        ch2 = (CheckBox)findViewById(R.id.checkBox19E8);
        ch3 = (CheckBox)findViewById(R.id.checkBox20E8);
        ch4 = (CheckBox)findViewById(R.id.checkBox21E8);
        ch5 = (CheckBox)findViewById(R.id.checkBox36E8);
        ch6 = (CheckBox)findViewById(R.id.checkBox35E8);
        ch7 = (CheckBox)findViewById(R.id.checkBox34E8);
        ch8 = (CheckBox)findViewById(R.id.checkBox37E8);
        ed1 = (EditText)findViewById(R.id.editText13E8);
        ed2 = (EditText)findViewById(R.id.editText9E8);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked())
                {
                    pSymptoms = "No";
                }
                if(rb2.isChecked())
                {
                    pSymptoms="Yes, ";
                    if(ch1.isChecked())
                    {
                        pSymptoms = pSymptoms+ch1.getText().toString();
                    }
                    if(ch2.isChecked())
                    {
                        pSymptoms = pSymptoms+ch2.getText().toString();
                    }
                    if(ch3.isChecked())
                    {
                        pSymptoms = pSymptoms+ch3.getText().toString();
                    }
                    if(ch4.isChecked())
                    {
                        pSymptoms = pSymptoms+ed1.getText().toString();
                    }




                }
                if(rb3.isChecked())
                {
                    pDailyAct = "No";
                }
                if(rb4.isChecked())
                {
                    pDailyAct="Yes, ";
                    if(ch1.isChecked())
                    {
                        pDailyAct = pDailyAct+ch5.getText().toString();
                    }
                    if(ch2.isChecked())
                    {
                        pDailyAct = pDailyAct+ch6.getText().toString();
                    }
                    if(ch3.isChecked())
                    {
                        pDailyAct = pDailyAct+ch7.getText().toString();
                    }
                    if(ch4.isChecked())
                    {
                        pDailyAct = pDailyAct+ed2.getText().toString();
                    }




                }
                EpisodeA1.PainSymptoms = pSymptoms;
                EpisodeA1.PainDailyAct = pDailyAct;



                Intent intent = new Intent(EpisodeA8.this, EpisodeA9.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA8.this, EpisodeA7.class);
                startActivity(intent);
            }
        });
    }
}

