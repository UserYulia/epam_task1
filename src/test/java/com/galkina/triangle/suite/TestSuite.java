package com.galkina.triangle.suite;

import com.galkina.triangle.calculation.TrianglePropertiesTest;
import com.galkina.triangle.entity.TriangleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses( {TriangleTest.class, TrianglePropertiesTest.class  })
@RunWith(Suite.class)
public class TestSuite {
}
