package com.galkina.triangle.definition;


import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TriangleDefinitionTest {

    private int x1,x2,x3;
    private int y1,y2,y3;
    private boolean expResult1, expResult2;

    public TriangleDefinitionTest(int x1, int y1, int x2, int y2, int x3, int y3, boolean expResult1, boolean expResult2) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.expResult1 = expResult1;
        this.expResult2 = expResult2;
    }

    @Test
    public void checkTriangleTrue(){
        Triangle triangle = new Triangle(new Point(x1,y1),new Point(x2,y2), new Point(x3,y3));
        Assert.assertTrue(TriangleDefinition.isTriangleExisting(triangle) == expResult2);
    }

    @Test
    public void checkRectangularTrue(){
        Triangle triangle = new Triangle(new Point(x1,y1),new Point(x2,y2), new Point(x3,y3));
        Assert.assertTrue(TriangleDefinition.isRectangular(triangle)==expResult1);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2, 2, 3, 3, false, false},
                {0, 3, 4, 0, 0, 0,true, true},
                {0, 2, -2, 0, 0, -3, false, true},
        });
    }

}
