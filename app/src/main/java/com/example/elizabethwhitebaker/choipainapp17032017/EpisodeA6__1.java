package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA6__1 extends AppCompatActivity {
    Button head;
    Button neck;
    Button chLeft;
    Button chRight;
    Button armLt;
    Button armRt;
    Button stLeft;
    Button stRight;
    Button handLt;
    Button handRt;
    Button luLeft;
    Button luRight;
    Button lmLeft;
    Button lmRight;
    Button llLeft;
    Button llRight;
    Button footLeft;
    Button footRight;
    Button handLtComp;
    Button handRtComp;
    Button luLeftComp;
    Button luRightComp;




    Button center;
    Button next;
    Button prev;
    String parts="";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a6__1);
        head = (Button)findViewById(R.id.head61);
        neck = (Button)findViewById(R.id.neck61);
        chLeft = (Button)findViewById(R.id.chLeft61);
        chRight = (Button)findViewById(R.id.chRight61);
        armLt = (Button)findViewById(R.id.armLt61);
        armRt = (Button)findViewById(R.id.armRt61);
        stLeft = (Button)findViewById(R.id.stLeft61);
        stRight = (Button)findViewById(R.id.stRight61);
        handLt = (Button)findViewById(R.id.handLt61);
        handRt = (Button)findViewById(R.id.handRt61);
        luLeft = (Button)findViewById(R.id.luLeft61);
        luRight = (Button)findViewById(R.id.luRight61);
        lmLeft = (Button)findViewById(R.id.lmLeft61);
        lmRight = (Button)findViewById(R.id.lmRight61);
        llLeft = (Button)findViewById(R.id.llLeft61);
        llRight = (Button)findViewById(R.id.llRight61);
        footLeft = (Button)findViewById(R.id.footLeft61);
        footRight = (Button)findViewById(R.id.footRight61);
        center = (Button)findViewById(R.id.center61);
        next =(Button)findViewById(R.id.next61);
        prev = (Button)findViewById(R.id.prev61);
        handLtComp = (Button)findViewById(R.id.handLtComp61);
        handRtComp = (Button)findViewById(R.id.handRtComp61);
        luLeftComp = (Button)findViewById(R.id.luLeftComp61);
        luRightComp = (Button)findViewById(R.id.luRightComp61);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.BodyBack = parts;
                Intent intent = new Intent(EpisodeA6__1.this, EpisodeA7.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA6__1.this, EpisodeA6.class);
                startActivity(intent);
            }
        });


        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                head.setBackgroundColor(Color.TRANSPARENT);
                neck.setBackgroundColor(Color.TRANSPARENT);
                chLeft.setBackgroundColor(Color.TRANSPARENT);
                chRight.setBackgroundColor(Color.TRANSPARENT);
                armLt.setBackgroundColor(Color.TRANSPARENT);
                armRt.setBackgroundColor(Color.TRANSPARENT);
                stLeft.setBackgroundColor(Color.TRANSPARENT);
                stRight.setBackgroundColor(Color.TRANSPARENT);
                handLt.setBackgroundColor(Color.TRANSPARENT);
                handRt.setBackgroundColor(Color.TRANSPARENT);
                luLeft.setBackgroundColor(Color.TRANSPARENT);
                luRight.setBackgroundColor(Color.TRANSPARENT);
                lmLeft.setBackgroundColor(Color.TRANSPARENT);
                lmRight.setBackgroundColor(Color.TRANSPARENT);
                llLeft.setBackgroundColor(Color.TRANSPARENT);
                llRight.setBackgroundColor(Color.TRANSPARENT);
                footLeft.setBackgroundColor(Color.TRANSPARENT);
                footRight.setBackgroundColor(Color.TRANSPARENT);
                handLtComp.setBackgroundColor(Color.TRANSPARENT);
                handRtComp.setBackgroundColor(Color.TRANSPARENT);
                luLeftComp.setBackgroundColor(Color.TRANSPARENT);
                luRightComp.setBackgroundColor(Color.TRANSPARENT);


                parts = "";
            }
        });


        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                head.setBackgroundColor(Color.RED);
                parts = parts+"head\t";
            }
        });
        neck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neck.setBackgroundColor(Color.RED);
                parts = parts+"neck\t";
            }
        });
        chLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chLeft.setBackgroundColor(Color.RED);
                parts = parts+"chLeft\t";
            }
        });

        chRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chRight.setBackgroundColor(Color.RED);
                parts = parts+"chRight\t";
            }
        });
        armLt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                armLt.setBackgroundColor(Color.RED);
                parts = parts+"armLt\t";
            }
        });
        armRt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                armRt.setBackgroundColor(Color.RED);
                parts = parts+"armRt\t";
            }
        });
        stLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stLeft.setBackgroundColor(Color.RED);
                parts = parts+"stLeft\t";
            }
        });
        stRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stRight.setBackgroundColor(Color.RED);
                parts = parts+"stRight\t";
            }
        });
        handLt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handLt.setBackgroundColor(Color.RED);
                handLtComp.setBackgroundColor(Color.RED);
                parts = parts+"handLt\t";
            }
        });
        handRt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handRt.setBackgroundColor(Color.RED);
                handRtComp.setBackgroundColor(Color.RED);
                parts = parts+"handRt\t";
            }
        });
        luLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                luLeft.setBackgroundColor(Color.RED);
                luLeftComp.setBackgroundColor(Color.RED);
                parts = parts+"luLeft\t";
            }
        });
        luRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                luRight.setBackgroundColor(Color.RED);
                luRightComp.setBackgroundColor(Color.RED);
                parts = parts+"luRight\t";
            }
        });
        lmLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lmLeft.setBackgroundColor(Color.RED);
                parts = parts+"lmLeft\t";
            }
        });
        lmRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lmRight.setBackgroundColor(Color.RED);
                parts = parts+"lmRight\t";
            }
        });
        llLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llLeft.setBackgroundColor(Color.RED);
                parts = parts+"llLeft\t";
            }
        });
        llRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llRight.setBackgroundColor(Color.RED);
                parts = parts+"llRight\t";
            }
        });
        footLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                footLeft.setBackgroundColor(Color.RED);
                parts = parts+"footLeft\t";
            }
        });
        footRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                footRight.setBackgroundColor(Color.RED);
                parts = parts+"footRight\t";
            }
        });




    }
}

