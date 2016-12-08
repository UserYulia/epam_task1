package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yulia on 07.12.2016.
 */
public class PointsParserTest {
        private static PointsParser parser;

    @BeforeClass
    public static void init(){parser = new PointsParser();}
    @AfterClass
    public static void destroy(){
        parser = null;
    }

    @Test(expected = NullPointerException.class)
    public void nullArguments() throws NotEnoughArgumentsException {
        parser.parse(null);
    }

    @Test(expected = NotEnoughArgumentsException.class)
    public void testArguments() throws NotEnoughArgumentsException {
        parser.parse(new ArrayList<String>());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCountStrings() throws NotEnoughArgumentsException {
        List<String> list= new ArrayList<String>();
        list.add("3 1");
        parser.parse(list);
    }

    @Test
    public void testParsing(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("0,3");
        list.add("2 1");
        list.add("-4,1");
        List<Point> actual = null;
        try {
            actual = parser.parse(list);
        } catch (NotEnoughArgumentsException e) {
            e.printStackTrace();
        }
        ArrayList<Point> expected = new ArrayList<Point>();
        expected.add(new Point(0,3));
        expected.add(new Point(2,1));
        expected.add(new Point(-4,1));
        Assert.assertEquals(expected,actual);
    }
}
