package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoScr5_1 extends AppCompatActivity {
    EditText PTG;
    EditText PTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr5_1);
        PTG = (EditText)findViewById(R.id.PTG);
        PTP = (EditText)findViewById(R.id.PTP);

        Button next = (Button)findViewById(R.id.nextButtonScr5_1);
        Button prev = (Button)findViewById(R.id.previousButtonScr5_1);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstScreen.PainTreatGoal = PTG.getText().toString();
                FirstScreen.PainTreatPref = PTP.getText().toString();
                Intent intent = new Intent(UserInfoScr5_1.this, com.example.lenovo.test2.UserInfoScr6.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr5_1.this, UserInfoScr4.class);
                startActivity(intent);
            }
        });



    }
}
