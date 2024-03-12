package com.mycompany.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

        ArrayList<Integer> mylist1=new ArrayList<Integer>(){};
        mylist1.add(6);
        mylist1.add(4);
        mylist1.add(3);
        mylist1.add(5);
        mylist1.add(2);
        ArrayList<Integer> mylist2=new ArrayList<Integer>(){};
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(3);
        mylist2.add(5);
        mylist2.add(1);

       assertEquals(new App().basicSort(mylist1,mylist2,1,6),true);

       /* int[]sorted=new App().basicSort(myArray);
        int[]expectedSorted=new int[]{0,1,2,4};
        assertArrayEquals(new App().basicSort(myArray),new int[]{0,1,2,4});*/
    }

    public void testAssertNotEqual() {
        /*int[] myArray=new int[]{2,1,4,0};
        assertNotSame(new App().basicSort(myArray),new int[]{2,1,4,0});*/
        ArrayList<Integer> mylist1=new ArrayList<Integer>(){};
        mylist1.add(7);
        mylist1.add(4);
        mylist1.add(3);
        mylist1.add(5);
        mylist1.add(2);
        ArrayList<Integer> mylist2=new ArrayList<Integer>(){};
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(3);
        mylist2.add(5);
        mylist2.add(1);
        assertNotEquals((new App().basicSort(mylist1,mylist2,1,6)),true);
    }

    public void testEmptyArray() {
        ArrayList<Integer> mylist1=new ArrayList<>();
        ArrayList<Integer> mylist2=new ArrayList<Integer>(){};
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(3);
        mylist2.add(5);
        mylist2.add(1);
        assertEquals(new App().basicSort(mylist1,mylist2,1,6),false);

        /*
        int[] myArray=new int[]{};
        assertArrayEquals(new App().basicSort(myArray),myArray);*/
    }
    public void testNotNull() {
        ArrayList<Integer> mylist1=null;
        ArrayList<Integer> mylist2=new ArrayList<Integer>(){};
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(3);
        mylist2.add(5);
        mylist2.add(1);
        assertNotNull(new App().basicSort(mylist1,mylist2,1,6));

        /*
        int[] myArray=new int[]{};
        Assert.assertNotNull(new App().basicSort(myArray));*/
    }
    public void testBothNull() {
        ArrayList<Integer> mylist1=null;
        ArrayList<Integer> mylist2=null;

        assertEquals(new App().basicSort(mylist1,mylist2,1,6),false);

        /*
        int[] myArray=new int[]{};
        Assert.assertNotNull(new App().basicSort(myArray));*/
    }

}
