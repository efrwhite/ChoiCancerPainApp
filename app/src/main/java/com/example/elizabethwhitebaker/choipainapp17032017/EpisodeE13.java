package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class EpisodeE13 extends AppCompatActivity {
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_e13);

        Button cont = (Button)findViewById(R.id.button10E13);
        sp1 = (Spinner)findViewById(R.id.spinner8E13);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EpisodeA1.PrefAltTher = sp1.getSelectedItem().toString();

                Intent intent = new Intent(EpisodeE13.this, EpisodeA4.class);
                startActivity(intent);


            }
        });
    }
}
