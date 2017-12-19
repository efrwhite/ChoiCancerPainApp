package com.example.elizabethwhitebaker.choipainapp17032017;



import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EpisodeA6 extends AppCompatActivity {
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
    Button center;
    Button handLtComp;
    Button handRtComp;
    Button luLeftComp;
    Button luRightComp;
    TextView front;
    ImageView fro;

    Button next;
    Button prev;
    String parts="";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a6);
        head = (Button)findViewById(R.id.head6);
        neck = (Button)findViewById(R.id.neck6);
        chLeft = (Button)findViewById(R.id.chLeft6);
        chRight = (Button)findViewById(R.id.chRight6);
        armLt = (Button)findViewById(R.id.armLt6);
        armRt = (Button)findViewById(R.id.armRt6);
        stLeft = (Button)findViewById(R.id.stLeft6);
        stRight = (Button)findViewById(R.id.stRight6);
        handLt = (Button)findViewById(R.id.handLt6);
        handRt = (Button)findViewById(R.id.handRt6);
        luLeft = (Button)findViewById(R.id.luLeft6);
        luRight = (Button)findViewById(R.id.luRight6);
        lmLeft = (Button)findViewById(R.id.lmLeft6);
        lmRight = (Button)findViewById(R.id.lmRight6);
        llLeft = (Button)findViewById(R.id.llLeft6);
        llRight = (Button)findViewById(R.id.llRight6);
        footLeft = (Button)findViewById(R.id.footLeft6);
        footRight = (Button)findViewById(R.id.footRight6);
        handLtComp = (Button)findViewById(R.id.handLtComp6);
        handRtComp = (Button)findViewById(R.id.handRtComp6);
        luLeftComp = (Button)findViewById(R.id.luLeftComp6);
        luRightComp = (Button)findViewById(R.id.luRightComp6);
        front = (TextView)findViewById(R.id.textView8);
        fro = (ImageView)findViewById(R.id.imageView36);

//front.setText(String.valueOf(fro.getHeight()));






        center = (Button)findViewById(R.id.center6);



        next =(Button)findViewById(R.id.next6);
        prev = (Button)findViewById(R.id.prev6);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.BodyFront = parts;
                Intent intent = new Intent(EpisodeA6.this, EpisodeA6__1.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA6.this, EpisodeA5.class);
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
