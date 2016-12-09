package com.galkina.triangle.validator;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class DataValidatorTest {
    private String str1,str2;
    private boolean expected;

    public DataValidatorTest(String str1, String str2, boolean expected) {
        this.str1 = str1;
        this.str2 = str2;
        this.expected = expected;
    }

    @Test
    public void checkValidTrue(){
        List<String> strings = new ArrayList<String>();
        strings.add(str1);
        strings.add(str2);
        Assert.assertTrue(DataValidator.test(strings)==expected);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"0 2", "-3 4",true},
                {"2 5", "3 b",false},
                {"25"," 45 6",false},
                {"dggdh","4 2", false},
                {"", "3 5", false}
        });
    }
}
