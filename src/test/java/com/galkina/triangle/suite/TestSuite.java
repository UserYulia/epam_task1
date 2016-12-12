package com.galkina.triangle.suite;

import com.galkina.triangle.definition.TriangleDefinitionTest;
import com.galkina.triangle.creater.TriangleListCreatorTest;
import com.galkina.triangle.entity.TriangleTest;
import com.galkina.triangle.parser.PointsParserTest;
import com.galkina.triangle.reader.DataReaderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses( {DataReaderTest.class, PointsParserTest.class, TriangleTest.class, TriangleListCreatorTest.class, TriangleDefinitionTest.class  })
@RunWith(Suite.class)
public class TestSuite {
}
