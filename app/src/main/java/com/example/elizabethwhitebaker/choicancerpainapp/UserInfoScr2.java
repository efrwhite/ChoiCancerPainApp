package com.example.elizabethwhitebaker.choicancerpainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class UserInfoScr2 extends AppCompatActivity {
RadioGroup rg1;
    RadioGroup rg2;
    RadioButton rb;
    RadioButton rb2;
TextView check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr2);

        Button next = (Button)findViewById(R.id.nextButtonScr2);
        Button prev = (Button)findViewById(R.id.previousButtonScr2);

        rg1 = (RadioGroup)findViewById(R.id.rg1);
        rg2 = (RadioGroup)findViewById(R.id.rg2);
        check = (TextView)findViewById(R.id.textView6);
        check.setText(FirstScreen.DOB);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr2.this, com.example.lenovo.test2.UserInfoScr3.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfoScr2.this, UserInfoScr1.class);
                startActivity(intent);
            }
        });

    }

    public void rbgender(View v)
    {
        int radioButtonId = rg1.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radioButtonId);
        FirstScreen.gender = rb.getText().toString();
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }

    public void rbgroup(View v)

    {
        int radioButtonId = rg2.getCheckedRadioButtonId();
        rb2=(RadioButton)findViewById(radioButtonId);
        FirstScreen.ethnicity = rb2.getText().toString();
        Toast.makeText(getBaseContext(),rb2.getText(),Toast.LENGTH_SHORT).show();

    }
}
