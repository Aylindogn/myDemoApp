package com.mycompany.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    public void testAssertEqual() {
        int[] myArray=new int[]{2,1,4,0};
        int[]sorted=new App().basicSort(myArray);
        int[]expectedSorted=new int[]{0,1,2,4};
        assertArrayEquals(new App().basicSort(myArray),new int[]{0,1,2,4});
    }

    public void testAssertNotEqual() {
        int[] myArray=new int[]{2,1,4,0};
        assertNotSame(new App().basicSort(myArray),new int[]{2,1,4,0});
    }

    public void testEmptyArray() {
        int[] myArray=new int[]{};
        assertArrayEquals(new App().basicSort(myArray),myArray);
    }

}
