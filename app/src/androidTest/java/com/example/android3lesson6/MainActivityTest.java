package com.example.android3lesson6;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.isEmptyString;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void simpleAddTest() {
        onView(withId(R.id.first_field_ed)).perform().check(matches((withText(isEmptyString()))));
        onView(withId(R.id.first_field_ed)).perform(typeText("12"));
        onView(withId(R.id.second_field_ed)).perform().check(matches((withText(isEmptyString()))));
        onView(withId(R.id.second_field_ed)).perform(typeText("17"));
        onView(withId(R.id.ok_btn)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("29")));


    }
}
