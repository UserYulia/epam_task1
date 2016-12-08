package com.galkina.triangle.reader;

import org.junit.Test;


/**
 * Created by Yulia on 07.12.2016.
 */
public class DataReaderTest {
    @Test(expected = NullPointerException.class)
    public void checkFileExisting(){
        DataReader reader = new DataReader();
        reader.readData("text.txt");
    }
}
