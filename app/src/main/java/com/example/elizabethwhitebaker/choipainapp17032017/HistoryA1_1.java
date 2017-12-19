package com.example.elizabethwhitebaker.choipainapp17032017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class HistoryA1_1 extends AppCompatActivity {
    DatePicker DateOB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a1_1);


        DateOB = (DatePicker) findViewById(R.id.datePicker);

        Button previousButton = (Button) findViewById(R.id.prevButtonHA11);
        Button nextButton = (Button) findViewById(R.id.nextButtonHA11);




        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mm = String.valueOf( DateOB.getMonth() + 1);
                String dd =  String.valueOf( DateOB.getDayOfMonth());
                String yy = String.valueOf( DateOB.getYear());


                StartPage.DOB = mm + "/" + dd + "/" + yy;
                Intent intent = new Intent(HistoryA1_1.this, HistoryA2.class);
                startActivity(intent);

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryA1_1.this, HistoryA1.class);
                startActivity(intent);
            }
        });
    }
}

