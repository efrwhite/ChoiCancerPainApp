package com.example.elizabethwhitebaker.choipainapp17032017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a11);


        Button yes = (Button)findViewById(R.id.button8E11);
        Button no = (Button)findViewById(R.id.button9E11);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EpisodeA1.PainManageBT = "Yes";
                Intent intent = new Intent(EpisodeA11.this, EpisodeA12.class);
                startActivity(intent);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainManageBT = "No";
                Intent intent = new Intent(EpisodeA11.this, EpisodeA14.class);
                startActivity(intent);
            }
        });
    }
}

