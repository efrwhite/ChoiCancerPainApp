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

public class HistoryA7Test3 {



    @Rule
    public ActivityTestRule<HistoryA7> HistoryA7TestRule = new ActivityTestRule<HistoryA7>(HistoryA7.class);

    private  HistoryA7 mActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(HistoryA8.class.getName(),null,false);
    public String check = "Check";


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenerio()
    {
        //assertNotNull(mActivity.findViewById(R.id.checkBox10a3));
        //select slider
        Espresso.onView((withId(R.id.radioButton8A7))).perform(click());
        //Espresso.onView((withId(R.id.radioButton9A7))).perform(click());
        //Espresso.onView((withId(R.id.editText11a7))).perform(typeText(check));
        //Espresso.onView((withId(R.id.radioButton7A7))).perform(click());

        //Espresso.onView(EpisodeA1.PainLevel).check(matches(withText("30")));
        //Espresso.onView((withId(R.id.spinner3E1))).perform(click());

        //click button
        Espresso.onView(withId(R.id.nextButtonHA7)).perform(click());

        Activity mActivity2 = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(mActivity2);

        mActivity2.finish();
    }



    @After
    public void tearDown() throws Exception {
    }
}