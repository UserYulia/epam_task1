package com.galkina.triangle.creater;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class TriangleBuilderTest {

    @Test
    public void testCreating() throws NotEnoughArgumentsException {
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(1,3));
        list.add(new Point(2,2));
        list.add(new Point(0,0));
        Triangle actual = TriangleBuilder.createTriangle(list);
        Triangle expected = new Triangle(new Point(1,3), new Point(2,2),new Point(0,0));
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = NotEnoughArgumentsException.class)
    public void checkIncorrectData() throws NotEnoughArgumentsException {
        TriangleBuilder.createTriangle(new ArrayList<Point>());
    }

    @Test(expected = NullPointerException.class)
    public void checkNullableArgument() throws NotEnoughArgumentsException {
        TriangleBuilder.createTriangle(null);
    }
}
