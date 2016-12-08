package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class PointsParser {
    public static final Logger LOG = Logger.getLogger(PointsParser.class);
    public static final int POINTS_COUNT = 3;

    public List<Point> parse(List<String> list) throws NotEnoughArgumentsException {
        ArrayList<Point> points = new ArrayList<Point>();
        if(list.isEmpty()){throw new NotEnoughArgumentsException("Not enough arguments.");}

        for(int i = 0; i<POINTS_COUNT; i++){
            if(list.get(i).length()<3) {throw new NotEnoughArgumentsException("Not enough arguments.");}
            String[] s = list.get(i).split("[^0-9-]");
            if(s.length<2){ throw new NotEnoughArgumentsException("Not enough arguments.");}
            points.add(new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        return points;
    }

}
