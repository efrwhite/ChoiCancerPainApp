package com.example.elizabethwhitebaker.choipainapp17032017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewEpisodeData extends AppCompatActivity {
    public static TextView showData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_episode_data);


        showData = (TextView)findViewById(R.id.textView9);
        showData.setText(StartPage.Check2);

    }
}
