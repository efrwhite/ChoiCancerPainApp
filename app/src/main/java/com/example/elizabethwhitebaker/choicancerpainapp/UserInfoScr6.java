package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoScr6 extends AppCompatActivity {
    EditText PPT;
    EditText CPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr6);

        PPT = (EditText)findViewById(R.id.PPT);
        CPT = (EditText)findViewById(R.id.CPT);

        Button next = (Button)findViewById(R.id.nextButtonScr6);
        Button prev = (Button)findViewById(R.id.previousButtonScr6);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstScreen.PastPainTreatment = PPT.getText().toString();
                FirstScreen.CurrentPainTreatment = CPT.getText().toString();
                Intent intent = new Intent(UserInfoScr6.this, com.example.lenovo.test2.UserInfoScr7.class);
                startActivity(intent);


            }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr6.this, UserInfoScr5_1.class);
                startActivity(intent);
            }
        });

    }
}
