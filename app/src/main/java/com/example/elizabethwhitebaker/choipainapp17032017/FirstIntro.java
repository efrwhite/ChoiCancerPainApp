package com.example.elizabethwhitebaker.choipainapp17032017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_intro);

        TextView Intro = (TextView)findViewById(R.id.introET);
        Button Start = (Button)findViewById(R.id.button11);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstIntro.this, StartPage.class);
                startActivity(intent);
            }
        });
    }
}

