package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HistoryA7 extends AppCompatActivity {
    public static String PHAref = "";
    public static String FHAref = "";
    public static String PSAref = "";
    RadioButton rb;
    RadioButton rb4;
    RadioButton rb5;
    RadioButton rb6;
    RadioButton rb2;
    RadioButton rb3;
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    EditText ed1;
    EditText ed2;
    EditText ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a7);


        Button previousButton = (Button) findViewById(R.id.prevButtonHA7);
        Button nextButton = (Button) findViewById(R.id.nextButtonHA7);
        ed1 = (EditText)findViewById(R.id.editText10a7);
        ed2 = (EditText)findViewById(R.id.editText11a7);
        ed3 = (EditText)findViewById(R.id.editText12a7);
        rb = (RadioButton)findViewById(R.id.radioButton6A7);
        rb2 = (RadioButton)findViewById(R.id.radioButton9A7);
        rb3 = (RadioButton)findViewById(R.id.radioButton7A7);
        rb4 = (RadioButton)findViewById(R.id.radioButton10A7);
        rb5 = (RadioButton)findViewById(R.id.radioButton8A7);
        rb6 = (RadioButton)findViewById(R.id.radioButton11A7);







        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb.isActivated())
                {
                    StartPage.AbusePersonalHistory = "No";
                }
                else
                {
                    StartPage.AbusePersonalHistory = ed1.getText().toString();
                }

                if(rb3.isActivated())
                {
                    StartPage.AbuseFamilyHistory = "No";
                }
                else
                {
                    StartPage.AbuseFamilyHistory = ed2.getText().toString();
                }

                if(rb5.isActivated())
                {
                    StartPage.AbuseSexualHistory = "No";
                }
                else
                {
                    StartPage.AbuseSexualHistory = ed3.getText().toString();
                }



                Intent intent = new Intent(HistoryA7.this, HistoryA8.class);
                startActivity(intent);


            }
        });



        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA7.this, HistoryA6.class);
                startActivity(intent);


            }
        });
    }
    public void phaMet(View v)
    {
        int radioButtonId = rg1.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radioButtonId);
        HistoryA7.PHAref = rb.getText().toString();
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }
    public void fhaMet(View v)
    {
        int radioButtonId = rg2.getCheckedRadioButtonId();
        rb2=(RadioButton)findViewById(radioButtonId);
        HistoryA7.FHAref = rb2.getText().toString();
        Toast.makeText(getBaseContext(),rb2.getText(),Toast.LENGTH_SHORT).show();
    }
    public void psaMet(View v)
    {
        int radioButtonId = rg3.getCheckedRadioButtonId();
        rb3=(RadioButton)findViewById(radioButtonId);
        HistoryA7.PSAref = rb3.getText().toString();
        Toast.makeText(getBaseContext(),rb3.getText(),Toast.LENGTH_SHORT).show();
    }
}
