package com.example.elizabethwhitebaker.choipainapp17032017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a4);


        Button yes =(Button)findViewById(R.id.button8E4);
        Button no = (Button)findViewById(R.id.button9E4);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainRel="Yes";
                Intent intent = new Intent(EpisodeA4.this, EpisodeA15.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainRel="No";
                Intent intent = new Intent(EpisodeA4.this, EpisodeA5.class);
                startActivity(intent);
            }
        });

    }
}

