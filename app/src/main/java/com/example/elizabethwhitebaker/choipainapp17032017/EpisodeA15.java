package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EpisodeA15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a15);
        TextView test = (TextView)findViewById(R.id.textView41E15);
        //test.setText(EpisodeA1.CollectiveData);
        Button done = (Button)findViewById(R.id.button3A15);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA15.this, FirstIntro.class);
                startActivity(intent);
            }
        });

    }
}

