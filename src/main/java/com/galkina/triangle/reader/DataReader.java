package com.galkina.triangle.reader;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DataReader {

    public static final Logger LOG = Logger.getLogger(DataReader.class);

    public static List<String> readData(String filename){
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            while (reader.ready()){
                list.add(reader.readLine());
            }
        }
        catch (IOException e) {
            LOG.fatal(e.getMessage());
            e.printStackTrace();
        }

        if(!list.isEmpty()){
            LOG.info("File "+filename+" successfully read.");
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> s = DataReader.readData("ddd");
        for (String str: s){
            System.out.println(str);
        }
    }
}
