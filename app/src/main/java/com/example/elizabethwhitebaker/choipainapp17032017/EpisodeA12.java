package com.example.elizabethwhitebaker.choipainapp17032017;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a12);

        Button pres = (Button)findViewById(R.id.button8E12);
        Button alte = (Button)findViewById(R.id.button9E12);

        pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA12.this, EpisodeA14.class);
                startActivity(intent);
            }
        });
        alte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA12.this, EpisodeE13.class);
                startActivity(intent);
            }
        });


    }
}

