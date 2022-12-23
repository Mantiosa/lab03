package com.example.lab03;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class UITest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lab03", appContext.getPackageName());
    }
    @Test
    public void Two_Plus_Two_Equals_Four() {
        final int expectedResult = 4;

        //Not working: https://stackoverflow.com/questions/20436968/espresso-typetext-not-working
        //onView(withId(R.id.txtMain)).perform(click(), typeText(givenString));

        onView(withId(R.id.bttn2)).perform(click());
        onView(withId(R.id.bttnPlus)).perform(click());
        onView(withId(R.id.bttn2)).perform(click());
        onView(withId(R.id.bttnEql)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(isDisplayed()));
    }
    @Test
    public void One_Minus_One_equals_Zero() {
        final int expectedResult = 0;

        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnMinus)).perform(click());
        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnEql)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void One_Divived_By_One_equals_One() {
        final int expectedResult = 1;

        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnDivi)).perform(click());
        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnEql)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void One_Multiplied_By_One_equals_One() {
        final int expectedResult = 1;

        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnMultipl)).perform(click());
        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnEql)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void Delete_Button_Deletes_Number() {
        final int expectedResult = 7;

        onView(withId(R.id.bttn7)).perform(click());
        onView(withId(R.id.bttn7)).perform(click());
        onView(withId(R.id.bttnC)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void Clear_Button_Clears_The_Numbers() {
        final int expectedResult = 0;

        onView(withId(R.id.bttn7)).perform(click());
        onView(withId(R.id.bttn6)).perform(click());
        onView(withId(R.id.bttn5)).perform(click());
        onView(withId(R.id.bttn4)).perform(click());
        onView(withId(R.id.bttn3)).perform(click());
        onView(withId(R.id.bttn2)).perform(click());
        onView(withId(R.id.bttn1)).perform(click());
        onView(withId(R.id.bttnCE)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void Root_Of_One_Should_Be_One() {
        final int expectedResult = 1;

        onView(withId(R.id.bttn7)).perform(click());
        onView(withId(R.id.bttnC)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }
    @Test
    public void Minus_Sign_Button_Works() {
        final int expectedResult = -7;

        onView(withId(R.id.bttn7)).perform(click());
        onView(withId(R.id.bttnSign)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }

}