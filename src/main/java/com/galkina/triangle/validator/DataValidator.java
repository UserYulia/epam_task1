package com.galkina.triangle.validator;



import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private static final Logger LOG = Logger.getLogger(DataValidator.class);

    public static List<String> parseValidData(List<String> strings){
        List<String> correctData = new ArrayList<>();
        Pattern p = Pattern.compile("-{0,1}\\d{1,10};-{0,1}\\d{1,10}");

        for (int i = 1;i<=strings.size();i++) {
            Matcher m = p.matcher(strings.get(i-1));

            if(!m.matches()){LOG.info("Data in sting "+i+" is invalid.");}
            else {correctData.add(strings.get(i-1));}
        }
        return correctData;
    }
}
