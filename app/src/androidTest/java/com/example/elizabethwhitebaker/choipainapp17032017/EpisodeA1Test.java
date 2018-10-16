package com.example.elizabethwhitebaker.choipainapp17032017;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.core.deps.guava.base.Predicate;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.core.deps.guava.base.Predicates.instanceOf;
import static android.support.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static android.support.test.espresso.matcher.ViewMatchers.isSelected;
import static android.support.test.espresso.matcher.ViewMatchers.supportsInputMethods;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EpisodeA1Test {

    
    
    
    @Rule
    public ActivityTestRule<EpisodeA1> EpisodeA1TestRule = new ActivityTestRule<EpisodeA1>(EpisodeA1.class);

    private  EpisodeA1 mActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(EpisodeA2.class.getName(),null,false);

    public int val = 50;
    public String check = "Chronic pain";

    @Before
    public void setUp() throws Exception {
        mActivity = EpisodeA1TestRule.getActivity();

    }


    @Test
    public void testUserInputScenerio()
    {
        assertNotNull(mActivity.findViewById(R.id.seekBarA1));
        //select slider
        Espresso.onView((withId(R.id.seekBarA1))).perform(click());

        //Spinners
        Espresso.onView(withId(R.id.spinner3E1)).perform(click());
        Espresso.onData(anything()).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.spinner3E1)).check(matches(withSpinnerText(containsString(check))));
        //Espresso.onView(EpisodeA1.PainLevel).check(matches(withText("30")));
        //Espresso.onView((withId(R.id.spinner3E1))).perform(click());

        //click button
        Espresso.onView(withId(R.id.nextButtonE1)).perform(click());

        Activity mActivity2 = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(mActivity2);

        mActivity2.finish();
    }



    @After
    public void tearDown() throws Exception {
        mActivity=null;


    }


}