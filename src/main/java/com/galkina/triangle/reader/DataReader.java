package com.galkina.triangle.reader;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;


public class DataReader {

    public static final Logger LOG = Logger.getLogger(DataReader.class);

    public List<String> readData(String filename){

        List<String> list = null;
        try {
            list = Files.readAllLines(new File(filename).toPath(), Charset.defaultCharset());
        }
        catch (FileNotFoundException e) {
            LOG.fatal("File not found.");
        }
        catch(IOException e) {
            LOG.error(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
