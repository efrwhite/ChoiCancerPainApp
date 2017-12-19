package com.example.elizabethwhitebaker.choipainapp17032017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class EpisodeA2 extends AppCompatActivity {
    String check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a2);
        Button cont = (Button)findViewById(R.id.button5E2);
        Button updt = (Button)findViewById(R.id.button6E2);
        final Spinner painTreat =(Spinner)findViewById(R.id.spinner);
        //   cont.setText(EpisodeA1.TypeOfPain.toString());
        check =EpisodeA1.TypeOfPain.toString();
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainUpdate = "Yes";
                StartPage.PainTreatPref = painTreat.getSelectedItem().toString();
                if(check.equals("Chronic pain"))
                {
                    Intent intent1 = new Intent(EpisodeA2.this, EpisodeA3.class);
                    startActivity(intent1);
                }
                else {
                    Intent intent = new Intent(EpisodeA2.this, EpisodeA5.class);
                    startActivity(intent);
                }
            }
        });

        updt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainUpdate = "Yes";
                Intent intent = new Intent(EpisodeA2.this, HistoryA5.class);
                startActivity(intent);
            }
        });

    }
}
