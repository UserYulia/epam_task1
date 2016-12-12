package com.galkina.triangle.creater;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TriangleListCreatorTest {

    @Test(expected = NullPointerException.class)
    public void checkNullableArgument() throws NotEnoughArgumentsException {
        TriangleListCreator.createTriangles(null);
    }

    @Test(expected = NotEnoughArgumentsException.class)
    public void checkNotEnoughArguments() throws NotEnoughArgumentsException {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2,3));
        points.add(new Point(0,0));
        TriangleListCreator.createTriangles(points);
    }

    @Test(expected = NotEnoughArgumentsException.class)
    public void checkNotEnoughArguments1() throws NotEnoughArgumentsException {
        List<Point> points = new ArrayList<>();
        TriangleListCreator.createTriangles(points);
    }

    @Test
    public void testCreating() throws NotEnoughArgumentsException {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2,3));
        points.add(new Point(0,0));
        points.add(new Point(-10,4));
        points.add(new Point(2,3));
        points.add(new Point(0,0));
        List<Triangle> actual = TriangleListCreator.createTriangles(points);
        List<Triangle> expected = new ArrayList<>();
        expected.add(new Triangle(new Point(2,3),new Point(0,0),new Point(-10, 4)));
        Assert.assertEquals(expected,actual);
    }
}
