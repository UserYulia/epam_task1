package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.validator.DataValidator;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class PointParser {
    public static final Logger LOG = Logger.getLogger(PointParser.class);

    public static List<Point> parsePoints(List<String> list) {
        ArrayList<Point> points = new ArrayList<>();
        if(list!=null&&!list.isEmpty()) {
            List<String> correctData = DataValidator.parseValidData(list);
            for (String line : correctData) {
                String[] s = line.split(";");
                Point point = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                points.add(point);
                LOG.info("Point added: " + point);
            }
        }
        else{
            LOG.info("No strings to parse.");
        }
        return points;
    }
}
