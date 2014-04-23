package com.adam.app.junittest;

import android.test.AndroidTestCase;

import junit.framework.Assert;

public class SomeTest extends AndroidTestCase {

    public void testSomeThing() throws Throwable {
        Assert.assertTrue(1 + 1 == 2);
    }
    
    public void testSomeThingElse() throws Throwable {
        Assert.assertTrue(1 + 2 == 3);
    }
    
}
