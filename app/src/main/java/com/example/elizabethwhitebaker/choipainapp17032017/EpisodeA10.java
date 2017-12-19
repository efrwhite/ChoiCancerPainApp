package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a10);


        Button alter =(Button)findViewById(R.id.button8E10);
        Button pursue = (Button)findViewById(R.id.button9E10);

        alter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA10.this, EpisodeA11.class);
                startActivity(intent);
            }
        });

        pursue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA10.this, EpisodeA14.class);
                startActivity(intent);
            }
        });
    }
}

