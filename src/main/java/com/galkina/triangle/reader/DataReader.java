package com.galkina.triangle.reader;

import com.galkina.triangle.exception.WrongFileNameException;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataReader {
    //private static final String DEFAULT_FILENAME="src/main/resources/data.txt";

    public static final Logger LOG = Logger.getLogger(DataReader.class);

    public static List<String> readData(String path) throws WrongFileNameException {
        List<String> data = new ArrayList<>();
        try {
            Files.lines(Paths.get(path)).forEach(data::add);
            LOG.info("File "+path+" successfully read.");
        }
        catch (IOException e) {
            throw new WrongFileNameException("File not found.");

        }

        return Collections.unmodifiableList(data);
    }
}
