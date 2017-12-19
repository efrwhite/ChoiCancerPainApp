package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EpisodeA9 extends AppCompatActivity {
    TextView painTreat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a9);


        Button yes = (Button)findViewById(R.id.button5E9);
        Button no = (Button)findViewById(R.id.button6E9);
        painTreat = (TextView)findViewById(R.id.textView37E9);
        painTreat.setText(StartPage.PainTreatPref);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA9.this, EpisodeA10.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA9.this, EpisodeA2.class);

                startActivity(intent);
            }
        });
    }
}
