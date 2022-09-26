package com.example.instrumentationargstest;

import android.content.Context;
import android.os.Bundle;

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
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.instrumentationargstest", appContext.getPackageName());
    }

    @Test
    public void checkCustomArgument() {
        // Get the arguments bundle.
        Bundle arguments = InstrumentationRegistry.getArguments();

        // Get the value if "argument1" exists
        String argument1 = arguments.getString("argument1");

        // Do something with the value. In this example it will make the test fail but it can be
        // used to modify a value in SharedPreferences or set the hostname of a backend server,
        // for example.
        assertNotEquals("make_test_fail", argument1);

    }
}