package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoScr8 extends AppCompatActivity {
EditText APH;
    EditText AFH;
    EditText ASH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr8);

        APH = (EditText)findViewById(R.id.APH);
        AFH = (EditText)findViewById(R.id.AFH);
        ASH = (EditText)findViewById(R.id.ASH);


        Button next = (Button)findViewById(R.id.nextButtonScr8);
        Button prev = (Button)findViewById(R.id.prevButtonScr8);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstScreen.AbusePersonalHistory = APH.getText().toString();
                FirstScreen.AbuseFamilyHistory = AFH.getText().toString();
                FirstScreen.AbuseSexualHistory = ASH.getText().toString();
                Intent intent = new Intent(UserInfoScr8.this, com.example.lenovo.test2.UserInfoScr9.class);
                startActivity(intent);

            }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr8.this, UserInfoScr7.class);
                startActivity(intent);
            }
        });


    }
}
