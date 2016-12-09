package com.galkina.triangle.reader;

import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class DataReaderTest {

    @Test
    public void testFileReading(){
        String rightPath = "src/main/resources/data.txt";
        List<String> actual = DataReader.readData(rightPath);
        List<String> expected = new ArrayList<String>();
        expected.add("-6,3");
        expected.add("45 5");
        expected.add("1 0 4");
        expected.add("5 5");
        Assert.assertEquals(expected,actual);
    }
}
