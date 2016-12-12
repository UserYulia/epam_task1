package com.galkina.triangle.reader;

import com.galkina.triangle.exception.WrongFileNameException;
import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class DataReaderTest {

    @Test
    public void testFileReading(){
        String rightPath = "src/main/resources/data.txt";
        List<String> actual = null;
        try {
            actual = DataReader.readData(rightPath);
        } catch (WrongFileNameException e) {
            e.printStackTrace();
        }
        List<String> expected = new ArrayList<>();
        expected.add("3;3");
        expected.add("0;0");
        expected.add("0;3");
        expected.add("6;;3");
        expected.add("11se;4");
        expected.add("4;5");
        Assert.assertEquals(expected,actual);
    }
}
