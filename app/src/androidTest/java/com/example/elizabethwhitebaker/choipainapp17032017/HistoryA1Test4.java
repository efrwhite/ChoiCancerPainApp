package com.example.elizabethwhitebaker.choipainapp17032017;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class HistoryA1Test4 {


    @Rule
    public ActivityTestRule<HistoryA1> HistoryA1TestRule = new ActivityTestRule<HistoryA1>(HistoryA1.class);

    private  HistoryA1 mActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(HistoryA1_1.class.getName(),null,false);
    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(HistoryA1.class.getName(),null,false);


    public String name1 = "Swanand";
    public String name2 = "Nalawade";
    public String email1 = "ssn6259";
    public String email2 = "ssn6259@uncw";
    public String email3 = "ssn6259@uncw.edu";
    public String ethinicity = "asian";


    public int val = 50;
    public String check = "0";



    @Before
    public void setUp() throws Exception {
        mActivity = HistoryA1TestRule.getActivity();
    }


    @Test
    public void testUserInputScenerio()
    {
        assertNotNull(mActivity.findViewById(R.id.editText));
        //select slider
        Espresso.onView((withId(R.id.radioButton12))).perform(click());

        Espresso.onView(withId(R.id.editText)).perform(typeText(name1));
        Espresso.onView(withId(R.id.editText2)).perform(typeText(name2));
        Espresso.onView(withId(R.id.editText6)).perform(typeText(email2));

        //Espresso.onView(EpisodeA1.PainLevel).check(matches(withText("30")));
        //Espresso.onView((withId(R.id.spinner3E1))).perform(click());

        //click button
        Espresso.onView(withId(R.id.nextButtonHA1)).perform(click());

        Activity mActivity2 = getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(mActivity2);

        mActivity2.finish();
    }





    @After
    public void tearDown() throws Exception {
    }


}