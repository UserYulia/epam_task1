package com.galkina.triangle.parser;

import org.junit.Test;
/**
 * Created by Yulia on 07.12.2016.
 */
public class PointsParserTest {
    @Test(expected = NullPointerException.class)
    public void testParser(){
        PointsParser parser = new PointsParser();
        parser.parse(null);
    }
}
