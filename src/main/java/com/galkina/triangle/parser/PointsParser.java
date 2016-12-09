package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.exception.NotValidDataException;
import com.galkina.triangle.validator.DataValidator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class PointsParser {
    public static final Logger LOG = Logger.getLogger(PointsParser.class);
    public static final int POINTS_COUNT = 3;

    public static List<Point> parse(List<String> list) throws NotValidDataException {

        if(DataValidator.test(list)) {
            ArrayList<Point> points = new ArrayList<Point>();

            for (int i = 0; i < POINTS_COUNT; i++) {
                String[] s = list.get(i).split("[^0-9-]");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                Point point = new Point(x, y);
                points.add(point);
                LOG.info("Point added: " + point);
            }
            return points;
        }
        else{
            throw new NotValidDataException();
        }
    }

}
