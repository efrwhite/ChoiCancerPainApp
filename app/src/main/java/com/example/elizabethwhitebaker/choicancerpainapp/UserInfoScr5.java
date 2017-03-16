package com.example.lenovo.test2;
//not used

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoScr5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_scr5);

        final EditText PTG = (EditText)findViewById(R.id.editText6);
        final EditText PTP = (EditText)findViewById(R.id.editText7);
        Button next = (Button)findViewById(R.id.nextButtonScr4);
        Button prev = (Button)findViewById(R.id.previousButtonScr4);
    next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FirstScreen.PainTreatGoal = PTG.getText().toString();
        FirstScreen.PainTreatPref = PTP.getText().toString();

        Intent intent = new Intent(UserInfoScr5.this, FirstScreen.class);
        startActivity(intent);
        }
    });
    prev.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(UserInfoScr5.this, UserInfoScr4.class);
            startActivity(intent);
        }
    });
    }
}
