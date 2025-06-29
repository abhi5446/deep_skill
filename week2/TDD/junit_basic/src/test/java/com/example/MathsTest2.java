package com.example;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MathsTest2 {
    Maths x;

    @Before
    public void setUp(){
        x=new Maths();
        System.out.println("Setting up");
    }

    @After
    public void tearDown(){
        x=null;
        System.out.println("tearing down");
    }

    @Test
    public void testSum(){
        assertEquals(12, x.sum(7, 5));
    }

    @Test
    public void testProd(){
        assertEquals(35, x.prod(7, 5));
    }
    
}
