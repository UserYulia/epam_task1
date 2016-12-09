package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.exception.NotValidDataException;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointsParserTest {

    @Test(expected = NullPointerException.class)
    public void nullArguments() throws NotValidDataException {
        PointsParser.parse(null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCountStrings() throws NotValidDataException {
        List<String> list= new ArrayList<String>();
        list.add("3 1");
        PointsParser.parse(list);
    }

    @Test(expected = NotValidDataException.class)
    public void checkData() throws NotValidDataException {
        List<String> list= new ArrayList<String>();
        list.add("3 b");
        PointsParser.parse(list);
    }

    @Test
    public void testParsing(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("0 3");
        list.add("2 1");
        list.add("-4 1");
        List<Point> actual = null;
        try {
            actual = PointsParser.parse(list);
        } catch (NotValidDataException e) {
            e.printStackTrace();
        }
        ArrayList<Point> expected = new ArrayList<Point>();
        expected.add(new Point(0,3));
        expected.add(new Point(2,1));
        expected.add(new Point(-4,1));
        Assert.assertEquals(expected,actual);
    }
}
