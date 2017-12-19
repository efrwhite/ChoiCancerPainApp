package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HistoryTest extends AppCompatActivity {
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_test);

        test = (TextView)findViewById(R.id.textView3a9);
        Button goback = (Button)findViewById(R.id.button3a9);
        test.setText(StartPage.CollectionData);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    FileInputStream fileIn=openFileInput("History.txt");
                    InputStreamReader InputRead= new InputStreamReader(fileIn);

                    char[] inputBuffer= new char[256];
                    String s="";
                    int charRead;

                    while ((charRead=InputRead.read(inputBuffer))>0) {
                        // char to string conversion
                        String readstring=String.copyValueOf(inputBuffer,0,charRead);
                        s +=readstring;
                    }
                    InputRead.close();
                    test.setText(s);

                    Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }




                //  test.setText(StartPage.CollectionData);

                Intent intent = new Intent(HistoryTest.this, StartPage.class);
                startActivity(intent);
            }
        });



    }
}
