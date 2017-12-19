package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.BodyBack;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.BodyFront;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainBOW;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainChanges;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainDON;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainDailyAct;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainFeelLike;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainId;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainLastHour;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainLastMin;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainLevel;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainManageBT;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainRel;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainStart;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainSymptoms;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PainUpdate;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.PrefAltTher;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.TreatApproach;
import static com.example.elizabethwhitebaker.choipainapp17032017.EpisodeA1.TypeOfPain;

public class EpisodeA14 extends AppCompatActivity {



    public static DatabaseHelper DB1;
    public static String body;
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a14);




        DB1 = new DatabaseHelper(this);




        Button pMed = (Button)findViewById(R.id.button8E14);
        Button npMed = (Button)findViewById(R.id.button9E14);

        pMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TreatApproach = "Pain Medication";

//Database
               if(PainLevel=="")
               {
                   PainLevel = "null";

               }
                if(TypeOfPain=="")
                {
                    TypeOfPain = "null";

                }
                if(PainId=="")
                {
                    PainId = "null";

                }
                if(PainRel=="")
                {
                    PainRel = "null";

                }
                if(PainUpdate=="")
                {
                    PainUpdate = "null";

                }
                if(PainFeelLike=="")
                {
                    PainFeelLike = "null";

                }
                if(PainStart=="")
                {
                    PainStart = "null";

                }
                if(PainLastHour=="")
                {
                    PainLastHour = "null";

                }
                if(PainLastMin=="")
                {
                    PainLastMin = "null";

                }
                if(PainChanges=="")
                {
                    PainChanges = "null";

                }
                if(PainBOW=="")
                {
                    PainBOW = "null";

                }
                if(PainDON=="")
                {
                    PainDON = "null";

                }
                if(PainSymptoms=="")
                {
                    PainSymptoms = "null";

                }
                if(PainDailyAct=="")
                {
                    PainDailyAct = "null";

                }
                if(PainManageBT=="")
                {
                    PainManageBT = "null";

                }
                if(PrefAltTher=="")
                {
                    PrefAltTher = "null";

                }
                if(BodyBack=="")
                {
                    BodyBack = "null";

                }
                if(BodyFront=="")
                {
                    BodyFront = "null";

                }
                if(TreatApproach=="")
                {
                    TreatApproach = "null";

                }

                EpisodeA1.CollectiveData = "1. "+ PainLevel + "\n"+ "2. "+
                        TypeOfPain + "\n"+"3. "+ PainId  + "\n"+"4. "+ PainRel + "\n"+"5. "+ PainUpdate + "\n"+"6. "+ PainFeelLike + "\n"+"7. "+ PainStart + "\n"+"8. "+ PainLastHour + "\n"+"9. "+ PainLastMin + "\n"+"10. "+ PainChanges  + "\n"+"11. "+ PainBOW + "\n"+"12. "+ PainDON + "\n"+"13. "+ PainSymptoms + "\n"+"14. "+ PainDailyAct + "\n"+"15. "+ PainManageBT  + "\n"+"16. "+ PrefAltTher + "\n"+"17. "+ BodyBack+ "\n"+"18. "+ BodyFront + "\n"+"19. "+ TreatApproach ;

                //HistoryA8.DB = new DatabaseOperations(ctx);
                DB1.putInformation2(HistoryA8.DB, PainLevel, TypeOfPain, PainId, PainRel, PainUpdate, PainFeelLike, PainStart,
                        PainLastHour, PainLastMin, PainChanges, PainBOW, PainDON, PainSymptoms, PainDailyAct, PainManageBT,
                        PrefAltTher, BodyBack, BodyFront, TreatApproach);
      //          Toast.makeText(getBaseContext(), "row inserted 1", Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), EpisodeA1.CollectiveData, Toast.LENGTH_SHORT).show();





                Cursor res = DB1.getAllData();

                     if (res.getCount() == 0) {
                //show msg
                //return;
                     } else {
                            StringBuffer buffer = new StringBuffer();

                    Toast.makeText(getBaseContext(), "Test2", Toast.LENGTH_SHORT).show();

                    res.moveToFirst();

                    while(res.moveToNext())
                    {

                        buffer.append("\nNew Episode:"+"\n");
                        buffer.append("PainLevel :"+ res.getString(0)+"\n");
                        buffer.append("TypeOfPain :"+ res.getString(1)+"\n");
                        buffer.append("PainID :"+ res.getString(2)+"\n");
                        buffer.append("PainRel :"+ res.getString(3)+"\n");
                        buffer.append("PainUpdate :"+ res.getString(4)+"\n");
                        buffer.append("PainFeelLike :"+ res.getString(5)+"\n");
                        buffer.append("PainStart :"+ res.getString(6)+"\n");
                        buffer.append("PainLastHour :"+ res.getString(7)+"\n");
                        buffer.append("PainLastMin :"+ res.getString(8)+"\n");
                        buffer.append("PainChanges :"+ res.getString(9)+"\n");
                        buffer.append("PainBOW :"+ res.getString(10)+"\n");
                        buffer.append("PainDON :"+ res.getString(11)+"\n");
                        buffer.append("PainSymptoms :"+ res.getString(12)+"\n");
                        buffer.append("PainDailyAct :"+ res.getString(13)+"\n");
                        buffer.append("PainManageBT :"+ res.getString(14)+"\n");
                        buffer.append("PrefAltTher :"+ res.getString(15)+"\n");
                        buffer.append("BodyBack :"+ res.getString(16)+"\n");
                        buffer.append("BodyFront :"+ res.getString(17)+"\n");
                        buffer.append("TreatApproach :"+ res.getString(18)+"\n");

                                Toast.makeText(getBaseContext(), "Test", Toast.LENGTH_SHORT).show();


                    }

                    if(buffer.toString() != "") {
                               body = buffer.toString();

                        Toast.makeText(getBaseContext(), buffer.toString(), Toast.LENGTH_SHORT).show();


                           }

           }


                try {
                    FileOutputStream fileout=openFileOutput("Episodes.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                    outputWriter.write(EpisodeA14.body);
                    outputWriter.close();

                    //display file saved message
                    Toast.makeText(getBaseContext(), "File saved successfully!",
                            Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }




                Intent intent = new Intent(EpisodeA14.this, EpisodeA15.class);
                startActivity(intent);




            }
        });
        npMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TreatApproach = "Non Medication Approach";

                EpisodeA1.CollectiveData = "1. "+ PainLevel + "\n"+ "2. "+ TypeOfPain + "\n"+"3. "+ PainId  + "\n"+"4. "+ PainRel + "\n"+"5. "+ PainUpdate + "\n"+"6. "+ PainFeelLike + "\n"+"7. "+ PainStart + "\n"+"8. "+ PainLastHour + "\n"+"9. "+ PainLastMin + "\n"+"10. "+ PainChanges  + "\n"+"11. "+ PainBOW + "\n"+"12. "+ PainDON + "\n"+"13. "+ PainSymptoms + "\n"+"14. "+ PainDailyAct + "\n"+"15. "+ PainManageBT  + "\n"+"16. "+ PrefAltTher + "\n"+"17. "+ BodyBack+ "\n"+"18. "+ BodyFront+ "\n"+"19. "+ TreatApproach;

                Intent intent = new Intent(EpisodeA14.this, EpisodeA15.class);
                startActivity(intent);
            }
        });
    }
}

