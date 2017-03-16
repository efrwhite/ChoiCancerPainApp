package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

public class UserInfoScr1 extends AppCompatActivity {
EditText fNameTxt;
    EditText lNameTxt;
    DatePicker DB;
    CalendarView CW;
    EditText DateOB;
    EditText Email;
    Button DateP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr1);
        fNameTxt = (EditText)findViewById(R.id.fNameTxt);
        lNameTxt = (EditText)findViewById(R.id.lNameTxt);
       Email = (EditText)findViewById(R.id.editText4);



        // DB = (DatePicker)findViewById(R.id.datePicker);
        //CW = (CalendarView)findViewById(R.id.calendarView);

        DateOB =(EditText)findViewById(R.id.editText3);
        Button previousButton = (Button) findViewById(R.id.previousButton);
        Button nextButton = (Button) findViewById(R.id.nextButton);
        previousButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(UserInfoScr1.this, FirstScreen.class);
            startActivity(intent);
        }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Calendar c = Calendar.getInstance();
                //int Year, month, day;

                FirstScreen.fName = String.valueOf(fNameTxt.getText());
                FirstScreen.lName = String.valueOf(lNameTxt.getText());
                FirstScreen.DOB = DateOB.getText().toString();
                FirstScreen.emailid = Email.getText().toString();

                Intent intent = new Intent(UserInfoScr1.this, com.example.lenovo.test2.UserInfoScr2.class);
                startActivity(intent);
            }
        });

    }
}
