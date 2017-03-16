package com.example.elizabethwhitebaker.choicancerpainapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class HistoryA1 extends AppCompatActivity {

    EditText fNameTxt;
    EditText lNameTxt;;
    EditText DateOB;
    EditText Ethnicity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a1);

        fNameTxt = (EditText)findViewById(R.id.editText);
        lNameTxt = (EditText)findViewById(R.id.editText2);
        Ethnicity = (EditText)findViewById(R.id.editText5);

        DateOB = (EditText)findViewById(R.id.editText4);



    }
}
