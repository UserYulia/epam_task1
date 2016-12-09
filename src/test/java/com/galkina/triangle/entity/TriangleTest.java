package com.galkina.triangle.entity;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {
    private static Triangle triangle;

    @BeforeClass
    public static void init(){
        triangle = new Triangle(new Point(0,3),new Point(4,0), new Point(0,0));
    }
    @AfterClass
    public static void destroy(){
        triangle = null;
    }

    @Test
    public void testPerimeterCalculating(){
        Assert.assertEquals(12.0,triangle.calcPerimeter());
    }
    @Test
    public void testAreaCalculating(){
        Assert.assertEquals(6.0,triangle.calcArea());
    }

    @Test
    public void testSideCalculating(){
        Assert.assertEquals(5.0, triangle.calculateSide(triangle.getA(), triangle.getB()));
        Assert.assertEquals(3.0, triangle.calculateSide(triangle.getA(), triangle.getC()));
        Assert.assertEquals(4.0, triangle.calculateSide(triangle.getB(), triangle.getC()));
    }
}
