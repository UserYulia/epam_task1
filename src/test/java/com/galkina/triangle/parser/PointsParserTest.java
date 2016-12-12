package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.exception.WrongFileNameException;
import com.galkina.triangle.reader.DataReader;
import com.galkina.triangle.validator.DataValidator;
import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PointsParserTest {

    @Test
    public void testParsing() {
        List<String> list = null;
        try {
            list = DataValidator.parseValidData(DataReader.readData("src/main/resources/data.txt"));
        } catch (WrongFileNameException e) {
            e.printStackTrace();
        }
        List<Point> actual = PointParser.parsePoints(list);
        ArrayList<Point> expected = new ArrayList<>();
        expected.add(new Point(3,3));
        expected.add(new Point(0,0));
        expected.add(new Point(0,3));
        expected.add(new Point(4,5));
        Assert.assertEquals(expected,actual);
    }
}
