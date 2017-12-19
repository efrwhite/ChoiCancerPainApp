package com.example.elizabethwhitebaker.choipainapp17032017;

import android.provider.BaseColumns;

/**
 * Created by PC on 10/1/2017.
 */

public class TableData {

    public TableData()
    {


    }
    public static abstract class TableInfo implements BaseColumns
    {

        public static final String DATABASE_NAME ="User_Info";
        public static final String TABLE_NAME ="reg_info";
        public static final String TABLE_NAME_2 ="epi_info";

        public static final String F_NAME="FirstName";
        public static final String L_NAME="LastName";
        public static final String GENDER="Gender";
        public static final String ETHINICITY="Ethinicity";
        public static final String CANCER_DETECTED="CancerDetected";
        public static final String OTHER_CONDITIONS="OtherConditions";
        public static final String PAST_PAIN_TREATMENT="PastPainTreatment";
        public static final String CURRENT_PAIN_TREATMENT="CurrentPainTreatment";
        public static final String PAST_USE_DRUGS="PastUseDrugs";
        public static final String CURRENT_USE_DRUGS="CurrentUseDrugs";
        public static final String ABUSE_PERSONAL_HISTORY="AbusePersonalHistory";
        public static final String ABUSE_FAMILY_HISTORY="AbuseFamilyHistory";
        public static final String ABUSE_SEXUAL_HISTORY="AbuseSexualHistory";
        public static final String EMAIL_ID="EmailID";
        public static final String DATE_OF_BIRTH="DateOfBirth";
        public static final String PAIN_TREATMENT_GOAL="PainTreatmentGoal";
        public static final String PAIN_TREATMENT_PREFERENCE="PainTreatmentPreference";


//        StartPage.fName + "\n" +StartPage.lName + "\n" +StartPage.gender + "\n" +StartPage.ethnicity +
// "\n" +StartPage.CancerDetected + "\n" +StartPage.OtherConditions + "\n" +StartPage.PastPainTreatment +
// "\n" +StartPage.CurrentPainTreatment + "\n" +StartPage.PastUseDrugs + "\n" +StartPage.CurrentUseDrugs +
// "\n" +StartPage.AbusePersonalHistory + "\n" +StartPage.AbuseFamilyHistory + "\n" +StartPage.AbuseSexualHistory +
// "\n" +StartPage.emailid + "\n" +StartPage.DOB + "\n" +StartPage.PainTreatGoal + "\n" +StartPage.PainTreatPref;



        public static final String PAIN_LEVEL="PainLevel";
        public static final String TYPE_OF_PAIN="TypeOfPain";
        public static final String PAIN_ID="PainID";
        public static final String PAIN_REL="PainREL";
        public static final String PAIN_UPDATE="PainUpdate";
        public static final String PAIN_FEEL_LIKE="PainFeelLike";
        public static final String PAIN_START="PainStart";
        public static final String PAIN_LAST_HOUR="PainLastHour";
        public static final String PAIN_LAST_MINUTE="PainLastMinute";
        public static final String PAIN_CHANGES="PainChanges";
        public static final String PAIN_BOW="PainBOW";
        public static final String PAIN_DON="PainDON";
        public static final String PAIN_SYMPTOMS="PainSymptoms";
        public static final String PAIN_DAILY_ACT="PainDailyAct";
        public static final String PAIN_MANAGE_BT="PainManageBT";
        public static final String PREF_ALT_THER="PrefAltTher";
        public static final String BODY_BACK="BodyBack";
        public static final String BODY_FRONT="BodyFront";
        public static final String TREAT_APPROACH="TreatApproach";




//        public static final String DATABASE_NAME ="User_Info";




//        EpisodeA1.CollectiveData = "1. "+EpisodeA1.PainLevel + "\n"+ "2. "+EpisodeA1.TypeOfPain +
// "\n"+"3. "+ EpisodeA1.PainId  + "\n"+"4. "+ EpisodeA1.PainRel + "\n"+"5. "+ EpisodeA1.PainUpdate +
// "\n"+"6. "+ EpisodeA1.PainFeelLike + "\n"+"7. "+ EpisodeA1.PainStart + "\n"+"8. "+ EpisodeA1.PainLastHour +
// "\n"+"9. "+ EpisodeA1.PainLastMin + "\n"+"10. "+ EpisodeA1.PainChanges  + "\n"+"11. "+ EpisodeA1.PainBOW +
// "\n"+"12. "+ EpisodeA1.PainDON + "\n"+"13. "+ EpisodeA1.PainSymptoms + "\n"+"14. "+ EpisodeA1.PainDailyAct +
// "\n"+"15. "+ EpisodeA1.PainManageBT  + "\n"+"16. "+ EpisodeA1.PrefAltTher + "\n"+"17. "+ EpisodeA1.BodyBack+
// "\n"+"18. "+ EpisodeA1.BodyFront + "\n"+"19. "+ EpisodeA1.TreatApproach ;


    }









}
