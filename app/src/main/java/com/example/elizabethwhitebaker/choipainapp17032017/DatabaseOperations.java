package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by PC on 10/1/2017.
 */

public class DatabaseOperations extends SQLiteOpenHelper {
    public static final int database_version = 1;

    public static final String DATABASE_NAME = "User_Info.db";
    public static final String TABLE_NAME ="reg_info";




    public static final String COL1_1="FirstName";
    public static final String COL1_2="LastName";
    public static final String COL1_3="Gender";
    public static final String COL1_4="Ethinicity";
    public static final String COL1_5="CancerDetected";
    public static final String COL1_6="OtherConditions";
    public static final String COL1_7="PastPainTreatment";
    public static final String COL1_8="CurrentPainTreatment";
    public static final String COL1_9="PastUseDrugs";
    public static final String COL1_10="CurrentUseDrugs";
    public static final String COL1_11="AbusePersonalHistory";
    public static final String COL1_12="AbuseFamilyHistory";
    public static final String COL1_13="AbuseSexualHistory";
    public static final String COL1_14="EmailID";
    public static final String COL1_15="DateOfBirth";
    public static final String COL1_16="PainTreatmentGoal";
    public static final String COL1_17="PainTreatmentPreference";


//        StartPage.fName + "\n" +StartPage.lName + "\n" +StartPage.gender + "\n" +StartPage.ethnicity +
// "\n" +StartPage.CancerDetected + "\n" +StartPage.OtherConditions + "\n" +StartPage.PastPainTreatment +
// "\n" +StartPage.CurrentPainTreatment + "\n" +StartPage.PastUseDrugs + "\n" +StartPage.CurrentUseDrugs +
// "\n" +StartPage.AbusePersonalHistory + "\n" +StartPage.AbuseFamilyHistory + "\n" +StartPage.AbuseSexualHistory +
// "\n" +StartPage.emailid + "\n" +StartPage.DOB + "\n" +StartPage.PainTreatGoal + "\n" +StartPage.PainTreatPref;





    public String CREATE_QUERY = "CREATE TABLE "+ TABLE_NAME+"( "+ COL1_1 +" TEXT, "
            + COL1_2+ " TEXT" + COL1_3 +" TEXT, " + COL1_4
            +" TEXT, " + COL1_5 +" TEXT, " + COL1_6 +" TEXT, "
            + COL1_7 +" TEXT, " + COL1_8 +" TEXT, "
            + COL1_9 +" TEXT, " + COL1_10 +" TEXT, "
            + COL1_11 +" TEXT, " + COL1_12 +" TEXT, "
            + COL1_13 +" TEXT, " + COL1_14 +" TEXT, "
            + COL1_15 +" TEXT, " + COL1_16 +" TEXT, "
            + COL1_17
            +" TEXT);  "  ;

    public DatabaseOperations(Context context) {

        super(context, DATABASE_NAME, null, database_version);
        SQLiteDatabase db = this.getWritableDatabase();

        Log.d("Database Operations","DATABASE CREATED");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY);
        Log.d("Database Operations", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop TABLE IF EXISTS " + TABLE_NAME+ ";");
        onCreate(db);
    }



        public Cursor getAllData(){
            SQLiteDatabase SQ = this.getWritableDatabase();
            Cursor res = SQ.rawQuery("select * from " + TABLE_NAME,null);
            return res;




            }

    public Cursor getInformation(DatabaseOperations dop)
    {

        SQLiteDatabase SQ = dop.getWritableDatabase();
        String coloums[] = {COL1_1, COL1_2};
        Cursor CR = SQ.query(TABLE_NAME, coloums,null, null,null,null,null);
        return CR;



    }




    public void putInformation(DatabaseOperations dop, String fname, String lname, String gender, String ethinicity,
                               String cancerDetected, String otherConditions, String pastPainTreatment,
                               String currentPainTreatment, String pastUseDrugs,
                               String currentUseDrugs, String abusePersonalHistory, String abuseFamilyHistory,
                               String abuseSexualHistory, String emailID,
                               String dateOfBirth, String painTreatmentGoal, String painTreatmentPreferences)
    {

        SQLiteDatabase db = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1_1, fname);
        cv.put(COL1_2, lname);
        cv.put(COL1_3, gender);
        cv.put(COL1_4, ethinicity);
        cv.put(COL1_5, cancerDetected);
        cv.put(COL1_6, otherConditions);
        cv.put(COL1_7, pastPainTreatment);
        cv.put(COL1_8, currentPainTreatment);
        cv.put(COL1_9, pastUseDrugs);
        cv.put(COL1_10, currentUseDrugs);
        cv.put(COL1_11, abusePersonalHistory);
        cv.put(COL1_12, abuseFamilyHistory);
        cv.put(COL1_13, abuseSexualHistory);
        cv.put(COL1_14, emailID);
        cv.put(COL1_15, dateOfBirth);
        cv.put(COL1_16, painTreatmentGoal);
        cv.put(COL1_17, painTreatmentPreferences);




        long k = db.insert(TABLE_NAME, null, cv);
//long k not compulsory
        Log.d("Database Operations","One row inserted");




    }

}
