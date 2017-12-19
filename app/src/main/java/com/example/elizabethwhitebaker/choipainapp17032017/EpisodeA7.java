package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class EpisodeA7 extends AppCompatActivity {
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    String pChange = "";
    String pBOW = "";
    String pDON = "";
    EditText ed1;
    EditText ed2;
    EditText ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a7);

        rb1= (RadioButton)findViewById(R.id.radioButton4E7);
        rb2= (RadioButton)findViewById(R.id.radioButton3E7);
        rb3= (RadioButton)findViewById(R.id.radioButton10E7);
        rb4= (RadioButton)findViewById(R.id.radioButton9E7);
        ed1 = (EditText)findViewById(R.id.editText11E7);
        ed2 = (EditText)findViewById(R.id.editText10E7);
        ed3 = (EditText)findViewById(R.id.editText12E7);

        Button next = (Button)findViewById(R.id.button9E7);
        Button prev = (Button)findViewById(R.id.button8E7);




        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb1.isChecked())
                {
                    pChange = "No";
                }
                if(rb2.isChecked())
                {
                    pChange = ed1.getText().toString();
                }

                pBOW = ed2.getText().toString();

                if(rb3.isChecked())
                {
                    pDON = "No";
                }
                if(rb4.isChecked())
                {
                    pDON = ed3.getText().toString();
                }

                EpisodeA1.PainChanges = pChange;
                EpisodeA1.PainBOW = pBOW;
                EpisodeA1.PainDON = pDON;



                Intent intent = new Intent(EpisodeA7.this, EpisodeA8.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA7.this, EpisodeA5.class);
                startActivity(intent);
            }
        });
    }
}

