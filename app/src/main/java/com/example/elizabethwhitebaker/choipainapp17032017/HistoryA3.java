package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class HistoryA3 extends AppCompatActivity {

    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    CheckBox chk4;
    CheckBox chk5;
    CheckBox chk6;
    CheckBox chk7;
    CheckBox chk8;
    EditText Othr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a3);

        chk1 = (CheckBox)findViewById(R.id.checkBoxa3);
        chk2 = (CheckBox)findViewById(R.id.checkBox2a3);
        chk3 = (CheckBox)findViewById(R.id.checkBox3a3);
        chk4 = (CheckBox)findViewById(R.id.checkBox4a3);
        chk5 = (CheckBox)findViewById(R.id.checkBox9a3);
        chk6 = (CheckBox)findViewById(R.id.checkBox10a3);
        chk7 = (CheckBox)findViewById(R.id.checkBox11a3);
        chk8 = (CheckBox)findViewById(R.id.checkBox12a3);
        Othr = (EditText)findViewById(R.id.editText3a3);


        Button previousButton = (Button) findViewById(R.id.prevButtonHA3);
        Button nextButton = (Button) findViewById(R.id.nextButtonHA3);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otherConditions = "";

                if(chk1.isActivated())
                {
                    otherConditions = otherConditions + chk1.getText().toString();

                }
                if(chk2.isActivated())
                {
                    otherConditions = otherConditions + chk2.getText().toString();

                }
                if(chk3.isActivated())
                {
                    otherConditions = otherConditions + chk3.getText().toString();

                }
                if(chk4.isActivated())
                {
                    otherConditions = otherConditions + chk4.getText().toString();

                }
                if(chk8.isActivated())
                {
                    otherConditions = otherConditions + chk8.getText().toString();

                }
                if(chk6.isActivated())
                {
                    otherConditions = otherConditions + chk6.getText().toString();

                }
                if(chk7.isActivated())
                {
                    otherConditions = otherConditions + chk7.getText().toString();

                }
                if(chk5.isActivated())
                {

                    otherConditions = otherConditions + Othr.getText().toString();
                }
                if(otherConditions == "")
                {
                    otherConditions = "NoneA";
                }
                StartPage.OtherConditions = otherConditions;

                Intent intent = new Intent(HistoryA3.this, HistoryA4.class);
                startActivity(intent);


            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA3.this, HistoryA2.class);
                startActivity(intent);

            }
        });

    }
}


