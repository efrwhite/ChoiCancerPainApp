package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class EpisodeA5 extends AppCompatActivity {
    Spinner sp1;
    Spinner sp2;
    Spinner sp3;
    Spinner sp4;
    EditText PFLsp1Txt;
    EditText PSsp2Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a5);
        sp1 = (Spinner)findViewById(R.id.spinner4A5);
        sp2 = (Spinner)findViewById(R.id.spinner5A5);
        sp3 = (Spinner)findViewById(R.id.spinner6A5);
        sp4 = (Spinner)findViewById(R.id.spinner7A5);
        PFLsp1Txt = (EditText)findViewById(R.id.editText14A5);


        PSsp2Txt = (EditText)findViewById(R.id.editText15A5);


        Button next = (Button)findViewById(R.id.nextButtonE5);
        Button prev = (Button)findViewById(R.id.prevButtonE5);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainFeelLike = sp1.getSelectedItem().toString();
                EpisodeA1.PainStart = sp2.getSelectedItem().toString();
                EpisodeA1.PainLastHour = sp3.getSelectedItem().toString();
                EpisodeA1.PainLastMin = sp4.getSelectedItem().toString();

                String sp1_1 = "";
                sp1_1 = sp1_1 + sp1.getSelectedItem().toString() + PFLsp1Txt.getText().toString();
                EpisodeA1.PainFeelLike = sp1_1;

                String sp1_2 = "";
                sp1_2 = sp1_2 + sp2.getSelectedItem().toString() + PSsp2Txt.getText().toString();
                EpisodeA1.PainStart = sp1_2;

                Intent intent = new Intent(EpisodeA5.this, EpisodeA6.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA5.this, EpisodeA2.class);
                startActivity(intent);
            }
        });


    }
}

