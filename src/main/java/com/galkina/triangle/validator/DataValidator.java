package com.galkina.triangle.validator;

/*Проверяет соответствие получаемых строк на соответствие формату "int int"*/

import org.apache.log4j.Logger;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private static final Logger LOG = Logger.getLogger(DataValidator.class);

    public static boolean test(List<String> strings){
        boolean isValid = false;
        Pattern p = Pattern.compile("-{0,1}\\d{1,} -{0,1}\\d{1,}");

        for (int i = 1;i<=strings.size();i++) {
            Matcher m = p.matcher(strings.get(i-1));
            isValid = m.matches();

            if(!isValid){
                LOG.info("Data in sting "+i+" is invalid.");
                break;
            }
        }
        return isValid;
    }
}
