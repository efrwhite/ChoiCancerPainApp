package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HistoryA6 extends AppCompatActivity {


    RadioGroup rg1;
    RadioButton rb;
    RadioButton rb2;


    RadioGroup rg2;

    public static String CDUref = "";
    public static String PDUref = "";

    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    CheckBox chk4;
    CheckBox chk5;
    CheckBox chk6;
    CheckBox chk7;
    CheckBox chk8;
    EditText past;
    EditText current;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a6);

        rg1 = (RadioGroup)findViewById(R.id.RG1A6);
        rg2 = (RadioGroup)findViewById(R.id.RG2A6);
        chk1 = (CheckBox)findViewById(R.id.checkBox19a6);
        chk2 = (CheckBox)findViewById(R.id.checkBox17a6);
        chk3 = (CheckBox)findViewById(R.id.checkBox20a6);
        chk4 = (CheckBox)findViewById(R.id.checkBox37a6);
        chk5 = (CheckBox)findViewById(R.id.checkBox35a6);
        chk6 = (CheckBox)findViewById(R.id.checkBox34a6);
        chk7 = (CheckBox)findViewById(R.id.checkBox36a6);
        chk8 = (CheckBox)findViewById(R.id.checkBox21a6);
        past = (EditText)findViewById(R.id.editText9a6);
        current = (EditText)findViewById(R.id.editText13a6);
        Button next = (Button)findViewById(R.id.nextButtonHA6);
        Button prev = (Button)findViewById(R.id.prevButtonHA6);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String PDU ="";
                String CDU ="";
                if(chk1.isActivated())
                {
                    PDU = PDU + chk1.getText().toString();
                }
                if(chk2.isActivated())
                {
                    PDU = PDU + chk2.getText().toString();
                }
                if(chk3.isActivated())
                {
                    PDU = PDU + chk3.getText().toString();
                }
                if(chk4.isActivated())
                {
                    PDU = PDU + past.getText().toString();
                }
                if(chk5.isActivated())
                {
                    CDU = CDU + chk5.getText().toString();
                }
                if(chk6.isActivated())
                {
                    CDU = CDU + chk6.getText().toString();
                }
                if(chk7.isActivated())
                {
                    CDU = CDU + chk7.getText().toString();
                }
                if(chk8.isActivated())
                {
                    CDU = CDU + current.getText().toString();
                }


                if(HistoryA6.PDUref == "No")
                {
                    StartPage.PastUseDrugs = "No";
                }
                else {
                    StartPage.PastUseDrugs = PDU;
                }

                if(HistoryA6.CDUref == "No")
                {

                    StartPage.CurrentUseDrugs = "No";

                }
                else {
                    StartPage.CurrentUseDrugs = CDU;
                }



                Intent intent = new Intent(HistoryA6.this, HistoryA7.class);
                startActivity(intent);


            }







        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA6.this, HistoryA5.class);
                startActivity(intent);
            }
        });



    }
    public void cduMet(View v)
    {
        int radioButtonId = rg2.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radioButtonId);
        HistoryA6.CDUref = rb.getText().toString();
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }


    public void pduMet(View v)
    {
        int radioButtonId = rg1.getCheckedRadioButtonId();
        rb2=(RadioButton)findViewById(radioButtonId);
        HistoryA6.PDUref = rb.getText().toString();
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }
}
