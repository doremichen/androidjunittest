package com.adam.app.junittest;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Alltests extends TestSuite {
     
    public static Test suite() {
        return new TestSuiteBuilder(Alltests.class).includeAllPackagesUnderHere().build();
    }
    
}
