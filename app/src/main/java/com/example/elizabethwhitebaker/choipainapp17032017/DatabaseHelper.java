package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by PC on 11/6/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int database_version1 = 1;

    public static final String DATABASE_NAME1 = "Episode_Info.db";
    public static final String TABLE_NAME_2 ="epi_info";



    public static final String COL2_1="PainLevel";
    public static final String COL2_2="TypeOfPain";
    public static final String COL2_3="PainID";
    public static final String COL2_4="PainREL";
    public static final String COL2_5="PainUpdate";
    public static final String COL2_6="PainFeelLike";
    public static final String COL2_7="PainStart";
    public static final String COL2_8="PainLastHour";
    public static final String COL2_9="PainLastMinute";
    public static final String COL2_10="PainChanges";
    public static final String COL2_11="PainBOW";
    public static final String COL2_12="PainDON";
    public static final String COL2_13="PainSymptoms";
    public static final String COL2_14="PainDailyAct";
    public static final String COL2_15="PainManageBT";
    public static final String COL2_16="PrefAltTher";
    public static final String COL2_17="BodyBack";
    public static final String COL2_18="BodyFront";
    public static final String COL2_19="TreatApproach";


    public String CREATE_QUERY1 = "CREATE TABLE "+ TABLE_NAME_2 + "( " + COL2_1 +" TEXT, "
            + COL2_2 +" TEXT, " + COL2_3 +" TEXT, "
            + COL2_4 +" TEXT, " + COL2_5 +" TEXT, "
            + COL2_6 +" TEXT, " + COL2_7 +" TEXT, "
            + COL2_8 +" TEXT, " + COL2_9 +" TEXT, "
            + COL2_10 +" TEXT, " + COL2_11 +" TEXT, "
            + COL2_12 +" TEXT, " + COL2_13 +" TEXT, "
            + COL2_14 +" TEXT, " + COL2_15 +" TEXT, "
            + COL2_16 +" TEXT, " + COL2_17 +" TEXT, "
            + COL2_18 +" TEXT, " + COL2_19 +" TEXT);";




    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME1, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY1);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_2+ ";");
        onCreate(db);
    }


    public void putInformation2(DatabaseOperations dop, String PainLevel, String TypeOfPain, String PainId,
                                String PainRel, String PainUpdate, String PainFeelLike, String PainStart,
                                String PainLastHour, String PainLastMin, String PainChanges, String PainBOW,
                                String PainDON, String PainSymptoms, String PainDailyAct, String PainManageBT,
                                String PrefAltTher, String BodyBack, String BodyFront, String TreatApproach)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv1 = new ContentValues();
        cv1.put(COL2_1, PainLevel);
        cv1.put(COL2_2, TypeOfPain);
        cv1.put(COL2_3, PainId);
        cv1.put(COL2_4, PainRel);
        cv1.put(COL2_5, PainUpdate);
        cv1.put(COL2_6, PainFeelLike);
        cv1.put(COL2_7, PainStart);
        cv1.put(COL2_8, PainLastHour);
        cv1.put(COL2_9, PainLastMin);
        cv1.put(COL2_10, PainChanges);
        cv1.put(COL2_11, PainBOW);
        cv1.put(COL2_12, PainDON);
        cv1.put(COL2_13, PainSymptoms);
        cv1.put(COL2_14, PainDailyAct);
        cv1.put(COL2_15, PainManageBT);
        cv1.put(COL2_16, PrefAltTher);
        cv1.put(COL2_17, BodyBack);
        cv1.put(COL2_18, BodyFront);
        cv1.put(COL2_19, TreatApproach);
        long k = db.insert(TABLE_NAME_2, null, cv1);
        Log.d("Database Operations","One row inserted");


    }

    public Cursor getAllData()
    {
       SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("sELECT * FROM "+ TABLE_NAME_2, null);
        return res;
    }

}
