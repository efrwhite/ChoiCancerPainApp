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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class EpisodeA2Test {

    @Rule
    public ActivityTestRule<EpisodeA2> EpisodeA2TestRule = new ActivityTestRule<EpisodeA2>(EpisodeA2.class);

    private  EpisodeA2 mActivity = null;

    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(EpisodeA5.class.getName(),null,false);

    public int val = 50;
    public String check = "0";

    @Before
    public void setUp() throws Exception {
        mActivity = EpisodeA2TestRule.getActivity();

    }


    @Test
    public void testUserInputScenerio()
    {
        assertNotNull(mActivity.findViewById(R.id.textView23E2));

        //Espresso.onView(EpisodeA1.PainLevel).check(matches(withText("30")));
        //Espresso.onView((withId(R.id.spinner3E1))).perform(click());

        //click button
        Espresso.onView(withId(R.id.button5E2)).perform(click());

        Activity mActivity2 = getInstrumentation().waitForMonitorWithTimeout(monitor1,5000);

        assertNotNull(mActivity2);

        mActivity2.finish();
    }



    @After
    public void tearDown() throws Exception {
        mActivity=null;


    }

}