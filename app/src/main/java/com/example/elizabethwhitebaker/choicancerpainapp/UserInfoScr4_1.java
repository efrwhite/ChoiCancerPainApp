package com.example.elizabethwhitebaker.choicancerpainapp;
//not used

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoScr4_1 extends AppCompatActivity {
    CheckBox chk18;
    CheckBox chk19;
    CheckBox chk20;
    CheckBox chk21;
    CheckBox chk22;
    CheckBox chk23;
    CheckBox chk24;
    CheckBox chk25;
    EditText edtTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr4_1);


        chk18 = (CheckBox) findViewById(R.id.checkBox18);
        chk19 = (CheckBox) findViewById(R.id.checkBox19);
        chk20 = (CheckBox) findViewById(R.id.checkBox20);
        chk21 = (CheckBox) findViewById(R.id.checkBox21);
        chk22 = (CheckBox) findViewById(R.id.checkBox22);
        chk23 = (CheckBox) findViewById(R.id.checkBox23);
        chk24 = (CheckBox) findViewById(R.id.checkBox24);
        chk25 = (CheckBox) findViewById(R.id.checkBox25);
        edtTxt = (EditText) findViewById(R.id.editText);

        Button next = (Button) findViewById(R.id.nextButtonScr4_1);
        Button prev = (Button) findViewById(R.id.previousButtonScr4_1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otherConditions = "";

               /* if(chk18.isActivated())
                {
                    otherConditions = otherConditions + chk18.getText().toString();

                }
                if(chk19.isActivated())
                {
                    otherConditions = otherConditions + chk19.getText().toString();

                }
                if(chk20.isActivated())
                {
                    otherConditions = otherConditions + chk20.getText().toString();

                }
                if(chk21.isActivated())
                {
                    otherConditions = otherConditions + chk21.getText().toString();

                }
                if(chk22.isActivated())
                {
                    otherConditions = otherConditions + chk22.getText().toString();

                }
                if(chk23.isActivated())
                {
                    otherConditions = otherConditions + chk23.getText().toString();

                }
                if(chk24.isActivated())
                {
                    otherConditions = otherConditions + chk24.getText().toString();

                }
                if(chk25.isActivated())
                {

                    otherConditions = otherConditions + edtTxt.getText().toString();
                }*/
                Toast.makeText(getBaseContext(), "Phase2", Toast.LENGTH_SHORT).show();
                FirstScreen.OtherConditions = otherConditions;

                Toast.makeText(getBaseContext(), "Phase1", Toast.LENGTH_SHORT).show();
               // Intent intent = new Intent(UserInfoScr4_1.this, UserInfoScr5.class);
                //startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr4_1.this, UserInfoScr3.class);
                startActivity(intent);
            }
        });

    }
}