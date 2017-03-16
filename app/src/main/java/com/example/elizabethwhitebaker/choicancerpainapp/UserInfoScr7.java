package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoScr7 extends AppCompatActivity {

    EditText PUD;
    EditText CUD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr7);

        PUD = (EditText)findViewById(R.id.PUD);
        CUD = (EditText)findViewById(R.id.CUD);

        Button next = (Button)findViewById(R.id.nextButtonScr7);
        Button prev = (Button)findViewById(R.id.prevButtonScr7);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstScreen.PastUseDrugs = PUD.getText().toString();
                FirstScreen.CurrentUseDrugs = CUD.getText().toString();
                Intent intent = new Intent(UserInfoScr7.this, com.example.lenovo.test2.UserInfoScr8.class);
                startActivity(intent);





            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr7.this, UserInfoScr6.class);
                startActivity(intent);
            }
        });


    }
}
